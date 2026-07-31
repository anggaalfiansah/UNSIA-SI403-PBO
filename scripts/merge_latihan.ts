import { readFile, writeFile } from "node:fs/promises";
import { join, dirname } from "node:path";
import { fileURLToPath } from "node:url";

async function main() {
  console.log("Memulai proses penggabungan Latihan 9-14...\n");

  try {
    const scriptsDir = dirname(fileURLToPath(import.meta.url));
    const rootDir = join(scriptsDir, "..");

    // 1. Definisikan header/cover terpadu
    let combinedContent = `# Kumpulan Laporan Tugas Pemrograman Berorientasi Objek
## Latihan Sesi 9 s/d 14

| | |
| :--- | :--- |
| **Kode Kelas** | SI403 |
| **Dosen Pengajar** | Dr. Fauziah , S.Kom., M.M.S.I. |
| **Universitas** | Universitas Siber Asia |
| **Nama Mahasiswa** | Angga Alfiansah |
| **NIM** | 240101010032 |

<div style="page-break-after: always;"></div>

`;

    // 2. Loop dari Latihan 9 sampai Latihan 14
    for (let i = 9; i <= 14; i++) {
      const folderName = `latihan${i}`;
      const fileName = `latihan${i}.md`;
      const filePath = join(rootDir, folderName, fileName);

      console.log(`Membaca file: ${filePath}...`);
      let content = await readFile(filePath, "utf-8");

      // Pisahkan cover header dengan mencari pembatas '---' pertama
      const lines = content.split("\n");
      let delimiterIndex = -1;
      for (let j = 0; j < lines.length; j++) {
        if (lines[j].trim() === "---") {
          delimiterIndex = j;
          break;
        }
      }

      if (delimiterIndex === -1) {
        console.warn(`⚠️ Warning: Tidak ditemukan pembatas '---' di ${fileName}. Menggunakan seluruh isi file.`);
      } else {
        // Ambil isi setelah '---'
        content = lines.slice(delimiterIndex + 1).join("\n");
      }

      // Sesuaikan path screenshot agar merujuk ke subdirektori masing-masing
      // Contoh: screenshoot/9-1.png -> latihan9/screenshoot/9-1.png
      content = content.replace(/screenshoot\//g, `${folderName}/screenshoot/`);

      // Tambahkan pembatas halaman (page break) sebelum bab baru, kecuali untuk bab pertama
      if (i > 9) {
        combinedContent += `\n<div style="page-break-after: always;"></div>\n\n`;
      }

      combinedContent += content.trim() + "\n";
    }

    // 3. Tulis file gabungan ke root
    const outputPath = join(rootDir, "latihan9-14.md");
    await writeFile(outputPath, combinedContent, "utf-8");
    console.log(`\n✅ Berhasil menggabungkan file ke: ${outputPath}\n`);

  } catch (error) {
    console.error("❌ Terjadi kesalahan saat penggabungan:", error);
  }
}

main();
