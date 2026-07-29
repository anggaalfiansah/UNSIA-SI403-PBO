import { mdToPdf } from "md-to-pdf";
import { readdir, stat } from "node:fs/promises";
import { join, extname, dirname } from "node:path";
import { fileURLToPath } from "node:url";

// Fungsi rekursif untuk mencari semua file .md (kecuali README.md)
async function getMarkdownFiles(dir: string, fileList: string[] = []) {
  const files = await readdir(dir);

  for (const file of files) {
    const filePath = join(dir, file);

    // Abaikan node_modules, .git, dan folder skrip itu sendiri jika ada
    if (filePath.includes("node_modules") || filePath.includes(".git") || filePath.includes("skrip")) {
      continue;
    }

    const fileStat = await stat(filePath);

    if (fileStat.isDirectory()) {
      await getMarkdownFiles(filePath, fileList);
    } else if (extname(file) === ".md" && file !== "README.md") {
      fileList.push(filePath);
    }
  }

  return fileList;
}

async function main() {
  console.log("Mulai memproses konversi Markdown ke PDF (via Bun)...\n");

  try {
    // Arahkan ke root direktori proyek (1 level di atas folder skrip)
    const rootDir = join(dirname(fileURLToPath(import.meta.url)), "..");
    const mdFiles = await getMarkdownFiles(rootDir);

    if (mdFiles.length === 0) {
      console.log("Tidak ditemukan file markdown untuk diproses.");
      return;
    }

    for (const mdFile of mdFiles) {
      console.log(`Memproses: ${mdFile}...`);

      try {
        const pdf = await mdToPdf(
          { path: mdFile },
          { 
            dest: mdFile.replace(/\.md$/, ".pdf"), 
            pdf_options: { 
              format: "A4",
              scale: 0.75,
              margin: { top: "15mm", right: "15mm", bottom: "15mm", left: "15mm" }
            } 
          }
        );

        if (pdf) {
          console.log(`✅ Berhasil membuat PDF untuk file tersebut.\n`);
        }
      } catch (err) {
        console.error(`❌ Gagal mengonversi ${mdFile}`);
        console.error(err);
      }
    }

    console.log("Proses selesai!");
  } catch (error) {
    console.error("Terjadi kesalahan:", error);
  }
}

main();
