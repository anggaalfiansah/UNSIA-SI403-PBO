# Tugas Pemrograman Berorientasi Objek (PBO)

Repositori ini berisi kumpulan tugas praktikum dan latihan pemrograman Java untuk mata kuliah **Pemrograman Berorientasi Objek (SI403)** di Universitas Siber Asia.

| Informasi          | Keterangan                     |
| :----------------- | :----------------------------- |
| **Kode Kelas**     | SI403                          |
| **Dosen Pengajar** | Dr. Fauziah , S.Kom., M.M.S.I. |
| **Universitas**    | Universitas Siber Asia         |
| **Nama Mahasiswa** | Angga Alfiansah                |
| **NIM**            | 240101010032                   |

---

## 📂 Struktur Repositori

Repositori ini disusun berdasarkan sesi pertemuan/latihan. Masing-masing folder berisi kode sumber Java (`.java`), file analisis/laporan (`.md`), dan folder `screenshoot` yang berisi bukti hasil eksekusi program.

- **`latihan9/`** - **Latihan Sesi 9 (Enkapsulasi)**
  Berisi implementasi konsep enkapsulasi (_Encapsulation_), termasuk penggunaan akses modifier (`private`, `public`) serta _getter_ dan _setter_.
- **`latihan10/`** - **Latihan Sesi 10 (Interface & Polimorfisme)**
  Berisi implementasi abstraksi antarmuka (_Interface_) dan konsep polimorfisme dalam pengembangan kelas Java.
- **`latihan11/`** - **Latihan Sesi 11 (Exception Handling)**
  Berisi contoh dan studi kasus penanganan kesalahan (_Exception Handling_) menggunakan blok `try-catch`.
- **`latihan12/`** - **Latihan Sesi 12 (Peran IDE & Dasar PBO)**
  Berisi analisis dan jawaban teoritis mengenai peran Integrated Development Environment (IDE) seperti NetBeans dalam pemrograman Java.
- **`latihan13/`** - **Latihan Sesi 13 (GUI Swing)**
  Berisi implementasi antarmuka grafis (GUI) menggunakan pustaka Java Swing, khususnya penggunaan `JRadioButton`, `JComboBox`, dan `JOptionPane`.
- **`latihan14/`** - **Latihan Sesi 14 (Koneksi Database MySQL)**
  Berisi teori dan praktik dasar menghubungkan aplikasi Java dengan basis data MySQL (JDBC).
- **`scripts/`** - **Utilitas Proyek**
  Berisi skrip otomatisasi (menggunakan Bun & TypeScript) untuk mengonversi file Markdown (`.md`) menjadi dokumen PDF secara massal.
- **`soal-latihan/`** - **Berkas Soal Asli**
  Berisi salinan berkas soal asli (PDF dan dokumen Word) dari dosen pengajar sebagai referensi tugas.

## 🚀 Cara Menjalankan Kode

1. Pastikan **Java Development Kit (JDK)** telah terinstal di komputer Anda (versi 8 atau lebih baru).
2. Clone repositori ini atau _download_ sebagai ZIP.
3. Buka terminal (atau Command Prompt / PowerShell) dan arahkan (_navigate_) ke folder latihan yang dituju. Contoh:
   ```bash
   cd latihan9
   ```
4. Lakukan kompilasi kode Java menggunakan perintah `javac`:
   ```bash
   javac nama_file.java
   ```
5. Jalankan program hasil kompilasi menggunakan perintah `java`:
   ```bash
   java nama_kelas_utama
   ```

> **Catatan**: Beberapa file merupakan latihan independen dan mungkin mendefinisikan kelas yang sama (seperti `Mahasiswa` atau `Mobil`). Namun, untuk menghindari konflik pada tingkatan _package_, nama-nama kelas tersebut telah dibedakan dan disesuaikan berdasarkan indeks latihannya.

---

_Dibuat untuk memenuhi tugas perkuliahan Pemrograman Berorientasi Objek di Universitas Siber Asia_
