# Kumpulan Laporan Tugas Pemrograman Berorientasi Objek
## Latihan Sesi 9 s/d 14

| | |
| :--- | :--- |
| **Kode Kelas** | SI403 |
| **Dosen Pengajar** | Dr. Fauziah , S.Kom., M.M.S.I. |
| **Universitas** | Universitas Siber Asia |
| **Nama Mahasiswa** | Angga Alfiansah |
| **NIM** | 240101010032 |

<div style="page-break-after: always;"></div>

# Analisis Kode Program Java - Latihan Sesi 9 (Enkapsulasi)

Dokumen ini berisi analisis baris demi baris serta penjelasan maksud dan tujuan untuk contoh kode Java mengenai konsep Enkapsulasi (Encapsulation).

---

## Latihan 1: Kelas Siswa

### Kode Sumber
```java
class Siswa {
    private String nama;
    private double nilai;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }
}

public class Main {
    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.setNama("Budi");
        s.setNilai(85.5);

        System.out.println("Nama Siswa: " + s.getNama());
        System.out.println("Nilai: " + s.getNilai());
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Kode ini merepresentasikan objek `Siswa` yang memiliki data pribadi berupa `nama` dan `nilai`. Data-data ini dilindungi dengan access modifier `private` (enkapsulasi).
* **Tujuan**: Melindungi variabel instansi `nama` dan `nilai` agar tidak dapat dimodifikasi atau dibaca secara sembarangan dari luar kelas. Akses pengisian data dialihkan melalui metode setter (`setNama`, `setNilai`) dan akses pembacaan data dialihkan melalui metode getter (`getNama`, `getNilai`). Dengan begitu, jika ingin menambahkan aturan validasi (misalnya nilai tidak boleh negatif atau lebih dari 100), kita dapat menambahkannya di dalam metode setter tanpa merusak kode luar.

### Analisa Per Baris
* **Baris 1**: `class Siswa {` — Mendeklarasikan kelas dengan nama `Siswa` menggunakan hak akses default (package-private).
* **Baris 2**: `private String nama;` — Mendeklarasikan variabel instansi `nama` bertipe `String` dengan access modifier `private` agar tidak dapat diakses secara langsung dari luar kelas.
* **Baris 3**: `private double nilai;` — Mendeklarasikan variabel instansi `nilai` bertipe `double` dengan access modifier `private`.
* **Baris 5**: `public void setNama(String nama) {` — Mendeklarasikan metode setter bertipe `void` dengan akses `public` untuk mengisi nilai atribut `nama`.
* **Baris 6**: `this.nama = nama;` — Menggunakan kata kunci `this` untuk merujuk pada variabel instansi objek saat ini guna membedakannya dari variabel parameter metode dengan nama yang sama.
* **Baris 7**: `}` — Penutup blok metode `setNama`.
* **Baris 9**: `public void setNilai(double nilai) {` — Mendeklarasikan metode setter bertipe `void` dengan akses `public` untuk mengisi nilai atribut `nilai`.
* **Baris 10**: `this.nilai = nilai;` — Mengisi variabel instansi objek `nilai` dengan nilai dari parameter metode.
* **Baris 11**: `}` — Penutup blok metode `setNilai`.
* **Baris 13**: `public String getNama() {` — Mendeklarasikan metode getter bertipe `String` dengan akses `public` untuk membaca nilai atribut `nama`.
* **Baris 14**: `return nama;` — Mengembalikan nilai dari variabel instansi `nama`.
* **Baris 15**: `}` — Penutup blok metode `getNama`.
* **Baris 17**: `public double getNilai() {` — Mendeklarasikan metode getter bertipe `double` dengan akses `public` untuk membaca nilai atribut `nilai`.
* **Baris 18**: `return nilai;` — Mengembalikan nilai dari variabel instansi `nilai`.
* **Baris 19**: `}` — Penutup blok metode `getNilai`.
* **Baris 20**: `}` — Penutup dari kelas `Siswa`.
* **Baris 22**: `public class Main {` — Mendeklarasikan kelas utama publik bernama `Main`.
* **Baris 23**: `public static void main(String[] args) {` — Titik masuk utama program Java (main method) saat dijalankan.
* **Baris 24**: `Siswa s = new Siswa();` — Membuat instansi objek baru dari kelas `Siswa` dan menyimpannya di variabel referensi `s`.
* **Baris 25**: `s.setNama("Budi");` — Memanggil metode `setNama` pada objek `s` untuk mengatur nama menjadi `"Budi"`.
* **Baris 26**: `s.setNilai(85.5);` — Memanggil metode `setNilai` pada objek `s` untuk mengatur nilai menjadi `85.5`.
* **Baris 28**: `System.out.println("Nama Siswa: " + s.getNama());` — Mengambil data nama menggunakan getter `getNama()` lalu mencetaknya ke konsol.
* **Baris 29**: `System.out.println("Nilai: " + s.getNilai());` — Mengambil data nilai menggunakan getter `getNilai()` lalu mencetaknya ke konsol.
* **Baris 30**: `}` — Penutup blok metode `main`.
* **Baris 31**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan9/screenshoot/9-1.png)


---

## Latihan 2: Kelas RekeningBank

### Kode Sumber
```java
class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank();
        rekening.setNomorRekening("123456789");
        rekening.setSaldo(5000000);

        System.out.println("Nomor Rekening: " + rekening.getNomorRekening());
        System.out.println("Saldo: Rp " + rekening.getSaldo());
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Program ini merancang kelas `RekeningBank` untuk menyimpan informasi penting berupa `nomorRekening` dan `saldo` nasabah secara aman menggunakan hak akses `private`.
* **Tujuan**: Menghindari modifikasi tidak sah dari luar kelas terhadap data penting seperti saldo (misal: penulisan langsung `rekening.saldo = -1000` dari kelas `Main` yang bisa mengacaukan sistem perbankan). Segala bentuk perubahan saldo diwajibkan melalui metode setter `setSaldo` untuk memvalidasi transaksi secara legal, sedangkan informasi rekening dibaca secara aman melalui metode getter.

### Analisa Per Baris
* **Baris 1**: `class RekeningBank {` — Mendeklarasikan kelas dengan nama `RekeningBank`.
* **Baris 2**: `private String nomorRekening;` — Mendeklarasikan atribut `nomorRekening` bertipe `String` dengan hak akses `private` (enkapsulasi).
* **Baris 3**: `private double saldo;` — Mendeklarasikan atribut `saldo` bertipe `double` dengan hak akses `private`.
* **Baris 5**: `public void setNomorRekening(String nomorRekening) {` — Mendeklarasikan metode setter bertipe `void` untuk menyimpan nomor rekening.
* **Baris 6**: `this.nomorRekening = nomorRekening;` — Mengisi variabel instansi objek `nomorRekening` dengan nilai parameter.
* **Baris 7**: `}` — Penutup blok metode `setNomorRekening`.
* **Baris 9**: `public void setSaldo(double saldo) {` — Mendeklarasikan metode setter bertipe `void` untuk mengatur nilai saldo.
* **Baris 10**: `this.saldo = saldo;` — Mengisi variabel instansi objek `saldo` dengan nilai parameter.
* **Baris 11**: `}` — Penutup blok metode `setSaldo`.
* **Baris 13**: `public String getNomorRekening() {` — Mendeklarasikan metode getter bertipe `String` untuk mengambil nomor rekening.
* **Baris 14**: `return nomorRekening;` — Mengembalikan nilai dari variabel instansi `nomorRekening`.
* **Baris 15**: `}` — Penutup blok metode `getNomorRekening`.
* **Baris 17**: `public double getSaldo() {` — Mendeklarasikan metode getter bertipe `double` untuk mengambil nilai saldo.
* **Baris 18**: `return saldo;` — Mengembalikan nilai dari variabel instansi `saldo`.
* **Baris 19**: `}` — Penutup blok metode `getSaldo`.
* **Baris 20**: `}` — Penutup kelas `RekeningBank`.
* **Baris 22**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 23**: `public static void main(String[] args) {` — Titik masuk utama program Java.
* **Baris 24**: `RekeningBank rekening = new RekeningBank();` — Membuat instansi objek baru dari kelas `RekeningBank` ke variabel `rekening`.
* **Baris 25**: `rekening.setNomorRekening("123456789");` — Mengatur nomor rekening menjadi `"123456789"` melalui metode setter.
* **Baris 26**: `rekening.setSaldo(5000000);` — Mengatur saldo menjadi `5000000` melalui metode setter.
* **Baris 28**: `System.out.println("Nomor Rekening: " + rekening.getNomorRekening());` — Membaca data nomor rekening menggunakan getter `getNomorRekening()` lalu mencetaknya ke konsol.
* **Baris 29**: `System.out.println("Saldo: Rp " + rekening.getSaldo());` — Membaca data saldo menggunakan getter `getSaldo()` lalu mencetaknya ke konsol.
* **Baris 30**: `}` — Penutup blok metode `main`.
* **Baris 31**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan9/screenshoot/9-2.png)


---

## Latihan 3: Kelas Kendaraan

### Kode Sumber
```java
class Kendaraan {
    private String merk;
    private int tahunProduksi;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }
}

public class Main {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        k.setMerk("Toyota");
        k.setTahunProduksi(2023);

        System.out.println("Merk Kendaraan: " + k.getMerk());
        System.out.println("Tahun Produksi: " + k.getTahunProduksi());
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Kode ini digunakan untuk merepresentasikan karakteristik dasar `Kendaraan` berupa `merk` dan `tahunProduksi` dengan prinsip enkapsulasi.
* **Tujuan**: Mencegah kesalahan entri data di dalam program. Atribut diatur `private` sehingga modifikasi data harus melalui setter. Di masa depan, setter `setTahunProduksi` dapat diberi filter logika agar tahun yang dimasukkan tidak boleh lebih dari tahun berjalan atau di bawah tahun tertentu (misal sebelum 1800), memastikan konsistensi dan integritas data objek.

### Analisa Per Baris
* **Baris 1**: `class Kendaraan {` — Mendeklarasikan kelas dengan nama `Kendaraan`.
* **Baris 2**: `private String merk;` — Mendeklarasikan atribut `merk` bertipe `String` dengan hak akses `private` (enkapsulasi).
* **Baris 3**: `private int tahunProduksi;` — Mendeklarasikan atribut `tahunProduksi` bertipe `int` dengan hak akses `private`.
* **Baris 5**: `public void setMerk(String merk) {` — Mendeklarasikan metode setter bertipe `void` untuk mengisi merk kendaraan.
* **Baris 6**: `this.merk = merk;` — Mengisi variabel instansi objek `merk` dengan nilai parameter.
* **Baris 7**: `}` — Penutup blok metode `setMerk`.
* **Baris 9**: `public void setTahunProduksi(int tahunProduksi) {` — Mendeklarasikan metode setter bertipe `void` untuk mengatur tahun produksi.
* **Baris 10**: `this.tahunProduksi = tahunProduksi;` — Mengisi variabel instansi objek `tahunProduksi` dengan nilai parameter.
* **Baris 11**: `}` — Penutup blok metode `setTahunProduksi`.
* **Baris 13**: `public String getMerk() {` — Mendeklarasikan metode getter bertipe `String` untuk membaca data merk.
* **Baris 14**: `return merk;` — Mengembalikan nilai dari variabel instansi `merk`.
* **Baris 15**: `}` — Penutup blok metode `getMerk`.
* **Baris 17**: `public int getTahunProduksi() {` — Mendeklarasikan metode getter bertipe `int` untuk mengambil tahun produksi.
* **Baris 18**: `return tahunProduksi;` — Mengembalikan nilai dari variabel instansi `tahunProduksi`.
* **Baris 19**: `}` — Penutup blok metode `getTahunProduksi`.
* **Baris 20**: `}` — Penutup kelas `Kendaraan`.
* **Baris 22**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 23**: `public static void main(String[] args) {` — Titik masuk utama program Java.
* **Baris 24**: `Kendaraan k = new Kendaraan();` — Membuat instansi objek baru dari kelas `Kendaraan` ke variabel `k`.
* **Baris 25**: `k.setMerk("Toyota");` — Mengisi merk kendaraan dengan `"Toyota"` menggunakan setter.
* **Baris 26**: `k.setTahunProduksi(2023);` — Mengisi tahun produksi dengan `2023` menggunakan setter.
* **Baris 28**: `System.out.println("Merk Kendaraan: " + k.getMerk());` — Mengambil data merk via getter dan mencetaknya.
* **Baris 29**: `System.out.println("Tahun Produksi: " + k.getTahunProduksi());` — Mengambil data tahun produksi via getter dan mencetaknya.
* **Baris 30**: `}` — Penutup blok metode `main`.
* **Baris 31**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan9/screenshoot/9-3.png)


---

## Latihan 4: Kelas Mahasiswa

### Kode Sumber
```java
class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("23101101");
        m.setNama("Andi");
        m.setIpk(3.75);

        System.out.println("NIM: " + m.getNim());
        System.out.println("Nama: " + m.getNama());
        System.out.println("IPK: " + m.getIpk());
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Kode ini membuat kelas `Mahasiswa` untuk menyimpan informasi profil akademik (`nim`, `nama`, `ipk`) secara terenkapsulasi.
* **Tujuan**: Mencegah manipulasi data akademik mahasiswa secara ilegal dari luar kelas (misalnya mengganti IPK secara sepihak tanpa melewati sistem kelulusan). Dengan enkapsulasi, akses ke data sensitif diwajibkan melalui getter-setter yang terkontrol, menjaga validitas data di dalam sistem database mahasiswa.

### Analisa Per Baris
* **Baris 1**: `class Mahasiswa {` — Mendeklarasikan kelas dengan nama `Mahasiswa`.
* **Baris 2**: `private String nim;` — Mendeklarasikan atribut `nim` bertipe `String` dengan akses `private` (enkapsulasi).
* **Baris 3**: `private String nama;` — Mendeklarasikan atribut `nama` bertipe `String` dengan akses `private`.
* **Baris 4**: `private double ipk;` — Mendeklarasikan atribut `ipk` bertipe `double` dengan akses `private`.
* **Baris 6**: `public void setNim(String nim) {` — Mendeklarasikan metode setter bertipe `void` untuk menyimpan data NIM.
* **Baris 7**: `this.nim = nim;` — Mengisi variabel instansi objek `nim` dengan nilai parameter.
* **Baris 8**: `}` — Penutup blok metode `setNim`.
* **Baris 10**: `public void setNama(String nama) {` — Mendeklarasikan metode setter bertipe `void` untuk menyimpan nama.
* **Baris 11**: `this.nama = nama;` — Mengisi variabel instansi objek `nama` dengan nilai parameter.
* **Baris 12**: `}` — Penutup blok metode `setNama`.
* **Baris 14**: `public void setIpk(double ipk) {` — Mendeklarasikan metode setter bertipe `void` untuk menyimpan IPK.
* **Baris 15**: `this.ipk = ipk;` — Mengisi variabel instansi objek `ipk` dengan nilai parameter.
* **Baris 16**: `}` — Penutup blok metode `setIpk`.
* **Baris 18**: `public String getNim() {` — Mendeklarasikan metode getter bertipe `String` untuk membaca data NIM.
* **Baris 19**: `return nim;` — Mengembalikan nilai dari variabel instansi `nim`.
* **Baris 20**: `}` — Penutup blok metode `getNim`.
* **Baris 22**: `public String getNama() {` — Mendeklarasikan metode getter bertipe `String` untuk membaca nama.
* **Baris 23**: `return nama;` — Mengembalikan nilai dari variabel instansi `nama`.
* **Baris 24**: `}` — Penutup blok metode `getNama`.
* **Baris 26**: `public double getIpk() {` — Mendeklarasikan metode getter bertipe `double` untuk membaca IPK.
* **Baris 27**: `return ipk;` — Mengembalikan nilai dari variabel instansi `ipk`.
* **Baris 28**: `}` Penutup blok metode `getIpk`.
* **Baris 29**: `}` — Penutup kelas `Mahasiswa`.
* **Baris 31**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 32**: `public static void main(String[] args) {` — Titik masuk utama program Java.
* **Baris 33**: `Mahasiswa m = new Mahasiswa();` — Membuat instansi objek baru dari kelas `Mahasiswa` ke variabel `m`.
* **Baris 34**: `m.setNim("23101101");` — Mengatur NIM objek `m` menjadi `"23101101"` via setter.
* **Baris 35**: `m.setNama("Andi");` — Mengatur nama objek `m` menjadi `"Andi"` via setter.
* **Baris 36**: `m.setIpk(3.75);` — Mengatur IPK objek `m` menjadi `3.75` via setter.
* **Baris 38**: `System.out.println("NIM: " + m.getNim());` — Mengambil data NIM via getter dan mencetaknya.
* **Baris 39**: `System.out.println("Nama: " + m.getNama());` — Mengambil data nama via getter dan mencetaknya.
* **Baris 40**: `System.out.println("IPK: " + m.getIpk());` — Mengambil data IPK via getter dan mencetaknya.
* **Baris 41**: `}` — Penutup blok metode `main`.
* **Baris 42**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan9/screenshoot/9-4.png)

<div style="page-break-after: always;"></div>

# Analisis Kode Program Java - Latihan Sesi 10 (Interface & Polimorfisme)

Dokumen ini berisi analisis baris demi baris serta penjelasan maksud dan tujuan untuk contoh kode Java mengenai konsep Interface dan Polimorfisme (Polymorphism).

---

## Latihan 1: Implementasi Interface Dasar

### Kode Sumber
```java
interface Kendaraan {
    void bergerak();
}

class Mobil implements Kendaraan {
    public void bergerak() {
        System.out.println("Mobil sedang bergerak");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.bergerak();
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Kode ini mendefinisikan sebuah antarmuka (*interface*) bernama `Kendaraan` dengan satu kontrak perilaku yaitu metode `bergerak()`. Kelas konkret `Mobil` kemudian mengimplementasikan interface tersebut dengan menyediakan kode pelaksanaan untuk metode tersebut.
* **Tujuan**: Memisahkan definisi kontrak perilaku (*what to do*) dengan detail implementasi konkret (*how to do*). Ini memastikan bahwa setiap objek bertipe `Kendaraan` di masa depan dijamin memiliki kemampuan untuk `bergerak`, meskipun cara bergeraknya berbeda-beda (misalnya `Mobil` berjalan, `Perahu` berlayar).

### Analisa Per Baris
* **Baris 1**: `interface Kendaraan {` — Mendeklarasikan sebuah interface baru dengan nama `Kendaraan`.
* **Baris 2**: `void bergerak();` — Mendeklarasikan metode abstrak `bergerak()` tanpa body/implementasi. Metode ini secara implisit bertipe `public` dan `abstract`.
* **Baris 3**: `}` — Penutup deklarasi interface `Kendaraan`.
* **Baris 5**: `class Mobil implements Kendaraan {` — Mendeklarasikan kelas bernama `Mobil` yang mengimplementasikan (memenuhi kontrak) interface `Kendaraan`.
* **Baris 6**: `public void bergerak() {` — Meng-override metode `bergerak()`. Implementasi metode dari interface wajib menggunakan kata kunci `public`.
* **Baris 7**: `System.out.println("Mobil sedang bergerak");` — Perintah keluaran untuk mencetak tulisan `"Mobil sedang bergerak"` ke layar konsol.
* **Baris 8**: `}` — Penutup blok metode `bergerak()`.
* **Baris 9**: `}` — Penutup deklarasi kelas `Mobil`.
* **Baris 11**: `public class Main {` — Mendeklarasikan kelas utama publik bernama `Main`.
* **Baris 12**: `public static void main(String[] args) {` — Titik masuk (entry point) utama untuk mengeksekusi program Java.
* **Baris 13**: `Mobil m = new Mobil();` — Membuat instansi objek baru dari kelas `Mobil` dan menyimpannya di variabel referensi `m`.
* **Baris 14**: `m.bergerak();` — Memanggil metode `bergerak()` pada objek `m`.
* **Baris 15**: `}` — Penutup blok metode `main`.
* **Baris 16**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan10/screenshoot/10-1.png)


---

## Latihan 2: Kelas Mahasiswa dengan Atribut Statis

### Kode Sumber
```java
interface User {
    void tampil();
}

class Mahasiswa implements User {
    String nama = "Budi";
    int umur = 20;

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.tampil();
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Membuat interface `User` dengan kontrak `tampil()`, yang diimplementasikan oleh kelas `Mahasiswa` untuk menyajikan data profil pengguna (nama dan umur) secara langsung dengan nilai default.
* **Tujuan**: Menstandarkan cara menampilkan profil pengguna di dalam program. Siapa pun objek yang bertindak sebagai pengguna (baik `Mahasiswa`, `Dosen`, atau `Admin`) wajib mengimplementasikan interface `User` sehingga profil mereka dapat dipanggil seragam melalui metode `tampil()`.

### Analisa Per Baris
* **Baris 1**: `interface User {` — Mendeklarasikan interface baru bernama `User`.
* **Baris 2**: `void tampil();` — Mendeklarasikan metode abstrak bernama `tampil()`.
* **Baris 3**: `}` — Penutup deklarasi interface `User`.
* **Baris 5**: `class Mahasiswa implements User {` — Mendeklarasikan kelas `Mahasiswa` yang mengimplementasikan interface `User`.
* **Baris 6**: `String nama = "Budi";` — Mendeklarasikan variabel `nama` bertipe data `String` dan menginisialisasinya dengan nilai default `"Budi"`.
* **Baris 7**: `int umur = 20;` — Mendeklarasikan variabel `umur` bertipe data `int` dengan inisialisasi awal nilai `20`.
* **Baris 9**: `public void tampil() {` — Mengimplementasikan metode `tampil()` dari interface `User`.
* **Baris 10**: `System.out.println("Nama: " + nama);` — Menampilkan label nama diikuti nilai dari variabel objek `nama` ke konsol.
* **Baris 11**: `System.out.println("Umur: " + umur);` — Menampilkan label umur diikuti nilai dari variabel objek `umur` ke konsol.
* **Baris 12**: `}` — Penutup blok metode `tampil()`.
* **Baris 13**: `}` — Penutup kelas `Mahasiswa`.
* **Baris 15**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 16**: `public static void main(String[] args) {` — Titik masuk utama program Java.
* **Baris 17**: `Mahasiswa m = new Mahasiswa();` — Membuat instansi objek baru dari kelas `Mahasiswa` dengan variabel referensi `m`.
* **Baris 18**: `m.tampil();` — Menjalankan metode `tampil()` milik kelas `Mahasiswa` yang menampilkan informasi nama dan umur statis.
* **Baris 19**: `}` — Penutup metode `main`.
* **Baris 20**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan10/screenshoot/10-2.png)


---

## Latihan 3: Input Dinamis dengan Scanner

### Kode Sumber
```java
import java.util.Scanner;

interface User {
    void tampil();
}

class Mahasiswa implements User {
    String nama;
    int umur;

    Mahasiswa(String n, int u) {
        nama = n;
        umur = u;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        Mahasiswa m = new Mahasiswa(nama, umur);
        m.tampil();
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Merupakan pengembangan dari Latihan 2, di mana profil pengguna (`Mahasiswa`) diinisialisasi secara dinamis berdasarkan input interaktif pengguna melalui *stream* `Scanner` dari konsol sebelum datanya ditampilkan.
* **Tujuan**: Menunjukkan cara mengintegrasikan kontrak interface `User` dengan aliran objek yang dinamis (menggunakan konstruktor berparameter `Mahasiswa(String n, int u)` untuk menampung data masukan pengguna secara *realtime*).

### Analisa Per Baris
* **Baris 1**: `import java.util.Scanner;` — Mengimpor pustaka `Scanner` untuk memfasilitasi pembacaan input keyboard dari pengguna.
* **Baris 3**: `interface User {` — Mendeklarasikan interface bernama `User`.
* **Baris 4**: `void tampil();` — Mendeklarasikan metode abstrak `tampil()`.
* **Baris 5**: `}` — Penutup interface `User`.
* **Baris 7**: `class Mahasiswa implements User {` — Mendeklarasikan kelas `Mahasiswa` yang mengimplementasikan interface `User`.
* **Baris 8**: `String nama;` — Mendeklarasikan variabel instansi `nama` bertipe `String` (tanpa inisialisasi nilai langsung).
* **Baris 9**: `int umur;` — Mendeklarasikan variabel instansi `umur` bertipe `int`.
* **Baris 11**: `Mahasiswa(String n, int u) {` — Mendeklarasikan konstruktor kelas `Mahasiswa` yang menerima dua buah parameter (`n` bertipe `String` dan `u` bertipe `int`).
* **Baris 12**: `nama = n;` — Memasukkan nilai dari parameter `n` ke dalam variabel instansi `nama`.
* **Baris 13**: `umur = u;` — Memasukkan nilai dari parameter `u` ke dalam variabel instansi `umur`.
* **Baris 14**: `}` — Penutup blok konstruktor.
* **Baris 16**: `public void tampil() {` — Mengimplementasikan metode `tampil()`.
* **Baris 17**: `System.out.println("Nama: " + nama);` — Menampilkan nilai nama dinamis ke layar.
* **Baris 18**: `System.out.println("Umur: " + umur);` — Menampilkan nilai umur dinamis ke layar.
* **Baris 19**: `}` — Penutup metode `tampil`.
* **Baris 20**: `}` — Penutup kelas `Mahasiswa`.
* **Baris 22**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 23**: `public static void main(String[] args) {` — Titik masuk utama eksekusi program.
* **Baris 24**: `Scanner input = new Scanner(System.in);` — Membuat instansi objek pembaca masukan `Scanner` dengan mengalirkan sistem input standar (`System.in`).
* **Baris 26**: `System.out.print("Masukkan nama: ");` — Mencetak teks instruksi pengisian nama.
* **Baris 27**: `String nama = input.nextLine();` — Membaca baris teks input dari konsol dan menyimpannya ke dalam variabel lokal `nama`.
* **Baris 29**: `System.out.print("Masukkan umur: ");` — Mencetak teks instruksi pengisian umur.
* **Baris 30**: `int umur = input.nextInt();` — Membaca input angka bertipe integer dari konsol dan menyimpannya ke variabel lokal `umur`.
* **Baris 32**: `Mahasiswa m = new Mahasiswa(nama, umur);` — Membuat objek baru `Mahasiswa` dengan meneruskan variabel `nama` dan `umur` ke konstruktor berparameter.
* **Baris 33**: `m.tampil();` — Mengeksekusi metode `tampil()` pada objek `m` untuk menampilkan data.
* **Baris 34**: `}` — Penutup blok metode `main`.
* **Baris 35**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan10/screenshoot/10-3.png)


---

## Latihan 4: Polimorfisme Interface (Darat & Udara)

### Kode Sumber
```java
import java.util.Scanner;

interface Kendaraan {
    void jalan();
}

class Mobil implements Kendaraan {
    public void jalan() {
        System.out.println("Mobil berjalan di darat");
    }
}

class Pesawat implements Kendaraan {
    public void jalan() {
        System.out.println("Pesawat terbang di udara");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Pesawat");
        int pilihan = input.nextInt();

        Kendaraan k;
        if (pilihan == 1) {
            k = new Mobil();
        } else {
            k = new Pesawat();
        }

        k.jalan();
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Mendemonstrasikan implementasi **Polimorfisme Runtime** menggunakan interface `Kendaraan` sebagai tipe referensi umum bagi objek `Mobil` dan `Pesawat`.
* **Tujuan**: Membuat program yang fleksibel dan modular. Referensi variabel `k` bertipe `Kendaraan` dapat menampung objek `Mobil` maupun `Pesawat` secara bergantian saat runtime. Ketika `k.jalan()` dipanggil, program secara otomatis menjalankan metode yang tepat tanpa perlu tahu tipe objek aslinya pada fase kompilasi.

### Analisa Per Baris
* **Baris 1**: `import java.util.Scanner;` — Mengimpor pustaka `Scanner`.
* **Baris 3**: `interface Kendaraan {` — Mendeklarasikan interface bernama `Kendaraan`.
* **Baris 4**: `void jalan();` — Deklarasi metode abstrak `jalan()` tanpa implementasi fisik.
* **Baris 5**: `}` — Penutup interface `Kendaraan`.
* **Baris 7**: `class Mobil implements Kendaraan {` — Mendeklarasikan kelas `Mobil` yang mengimplementasikan interface `Kendaraan`.
* **Baris 8**: `public void jalan() {` — Implementasi metode `jalan()` milik kelas `Mobil`.
* **Baris 9**: `System.out.println("Mobil berjalan di darat");` — Menampilkan output `"Mobil berjalan di darat"`.
* **Baris 10**: `}` — Penutup metode `jalan()` kelas `Mobil`.
* **Baris 11**: `}` — Penutup kelas `Mobil`.
* **Baris 13**: `class Pesawat implements Kendaraan {` — Mendeklarasikan kelas `Pesawat` yang mengimplementasikan interface `Kendaraan`.
* **Baris 14**: `public void jalan() {` — Implementasi metode `jalan()` milik kelas `Pesawat`.
* **Baris 15**: `System.out.println("Pesawat terbang di udara");` — Menampilkan output `"Pesawat terbang di udara"`.
* **Baris 16**: `}` — Penutup metode `jalan()` kelas `Pesawat`.
* **Baris 17**: `}` — Penutup kelas `Pesawat`.
* **Baris 19**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 20**: `public static void main(String[] args) {` — Titik masuk program utama Java.
* **Baris 21**: `Scanner input = new Scanner(System.in);` — Membuat objek Scanner untuk menangkap masukan pengguna.
* **Baris 23-25**: Menampilkan menu pilihan kendaraan dan menampung input integer masukan ke variabel lokal `pilihan`.
* **Baris 27**: `Kendaraan k;` — Mendeklarasikan variabel referensi `k` bertipe interface `Kendaraan`. Variabel ini dapat merujuk pada objek dari kelas apa pun yang mengimplementasikan interface `Kendaraan` (Prinsip Polimorfisme).
* **Baris 28**: `if (pilihan == 1) {` — Logika percabangan untuk memeriksa nilai variabel `pilihan`.
* **Baris 29**: `k = new Mobil();` — Jika pilihan bernilai `1`, referensi `k` diisi dengan instansiasi objek `Mobil`.
* **Baris 30**: `} else {` — Jika kondisi pada blok `if` tidak terpenuhi.
* **Baris 31**: `k = new Pesawat();` — Referensi `k` diisi dengan instansiasi objek `Pesawat`.
* **Baris 32**: `}` — Batas akhir blok if-else.
* **Baris 34**: `k.jalan();` — Memanggil metode `jalan()` menggunakan referensi `k`. Objek yang diakses bersifat dinamis sesuai isi referensi `k` saat runtime.
* **Baris 35**: `}` — Penutup metode `main`.
* **Baris 36**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan10/screenshoot/10-4.png)


---

## Latihan 6: Kelas Belanja (Hitung Total)

### Kode Sumber
```java
import java.util.Scanner;

interface Keranjang {
    int hitungTotal();
}

class Item implements Keranjang {
    int harga;
    int qty;

    Item(int h, int q) {
        harga = h;
        qty = q;
    }

    public int hitungTotal() {
        return harga * qty;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga barang: ");
        int harga = input.nextInt();

        System.out.print("Jumlah beli: ");
        int qty = input.nextInt();

        Item i = new Item(harga, qty);
        System.out.println("Total belanja: " + i.hitungTotal());
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Program ini merancang kelas `Item` (barang belanjaan) yang mengimplementasikan interface `Keranjang` dengan kontrak penghitungan total belanja (`hitungTotal()`).
* **Tujuan**: Menyediakan struktur kalkulasi belanja yang fleksibel. Jika kelak ada objek bertipe kasir lainnya (misalnya kelas `JasaLayanan` atau `PaketPromo` yang juga masuk keranjang belanja), program utama kasir tetap bisa menghitung total belanjanya dengan seragam selama kelas-kelas tersebut mengimplementasikan interface `Keranjang`.

### Analisa Per Baris
* **Baris 1**: `import java.util.Scanner;` — Mengimpor pustaka `Scanner`.
* **Baris 3**: `interface Keranjang {` — Mendeklarasikan interface bernama `Keranjang`.
* **Baris 4**: `int hitungTotal();` — Deklarasi metode abstrak `hitungTotal()` yang mengembalikan nilai berupa integer.
* **Baris 5**: `}` — Penutup interface `Keranjang`.
* **Baris 7**: `class Item implements Keranjang {` — Mendeklarasikan kelas `Item` yang mengimplementasikan interface `Keranjang`.
* **Baris 8**: `int harga;` — Mendeklarasikan atribut instansi `harga` bertipe `int`.
* **Baris 9**: `int qty;` — Mendeklarasikan atribut instansi `qty` bertipe `int`.
* **Baris 11**: `Item(int h, int q) {` — Deklarasi konstruktor kelas `Item` dengan dua parameter masukan.
* **Baris 12**: `harga = h;` — Menyimpan nilai dari parameter `h` ke atribut `harga`.
* **Baris 13**: `qty = q;` — Menyimpan nilai dari parameter `q` ke atribut `qty`.
* **Baris 14**: `}` — Penutup blok konstruktor `Item`.
* **Baris 16**: `public int hitungTotal() {` — Implementasi metode `hitungTotal()` sesuai kontrak interface.
* **Baris 17**: `return harga * qty;` — Melakukan kalkulasi total belanja berupa perkalian harga dan kuantitas (`qty`), serta mengembalikan hasil perhitungannya.
* **Baris 18**: `}` — Penutup metode `hitungTotal`.
* **Baris 19**: `}` — Penutup kelas `Item`.
* **Baris 21**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 22**: `public static void main(String[] args) {` — Titik masuk utama aplikasi.
* **Baris 23**: `Scanner input = new Scanner(System.in);` — Membuat objek Scanner untuk membaca input.
* **Baris 25-26**: Menampilkan petunjuk pengisian harga barang dan menampungnya di variabel lokal `harga`.
* **Baris 28-29**: Menampilkan petunjuk pengisian kuantitas beli dan menampungnya di variabel lokal `qty`.
* **Baris 31**: `Item i = new Item(harga, qty);` — Membuat objek baru dari kelas `Item` menggunakan data input `harga` dan `qty`.
* **Baris 32**: `System.out.println("Total belanja: " + i.hitungTotal());` — Menampilkan pesan total belanja hasil pemanggilan metode `hitungTotal()` milik objek `i`.
* **Baris 33**: `}` — Penutup metode `main`.
* **Baris 34**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan10/screenshoot/10-6.png)


---

## Latihan 7: Gabungan Produk dan Pembayaran

### Kode Sumber
```java
import java.util.Scanner;

interface Produk {
    void tampil();
}

interface Pembayaran {
    void proses();
}

class Barang implements Produk {
    String nama;
    int harga;

    Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampil() {
        System.out.println("Produk: " + nama);
        System.out.println("Harga: " + harga);
    }
}

class Transfer implements Pembayaran {
    public void proses() {
        System.out.println("Pembayaran via Transfer berhasil");
    }
}

class COD implements Pembayaran {
    public void proses() {
        System.out.println("Pembayaran COD saat barang diterima");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama produk: ");
        String nama = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();

        Barang b = new Barang(nama, harga);
        b.tampil();

        System.out.println("Pilih pembayaran: 1.Transfer 2.COD");
        int pilih = input.nextInt();

        Pembayaran p;
        if (pilih == 1) {
            p = new Transfer();
        } else {
            p = new COD();
        }

        System.out.println("Proses transaksi:");
        p.proses();
    }
}
```

### Maksud dan Tujuan Kode
* **Maksud**: Program ini merancang simulasi sistem transaksi belanja modular. Memisahkan antara entitas produk (lewat interface `Produk` dan kelas `Barang`) dengan logika transaksi pembayaran (lewat interface `Pembayaran` dan kelas konkret `Transfer` serta `COD`).
* **Tujuan**: Memberikan pemahaman arsitektur sistem e-commerce berskala besar. Dengan merancang sistem menggunakan *multi-interface*, kita bisa menambahkan metode pembayaran baru (misalnya e-wallet, kartu kredit) tanpa perlu mengubah kode produk (`Barang`) atau alur transaksi utama program.

### Analisa Per Baris
* **Baris 1**: `import java.util.Scanner;` — Mengimpor Scanner.
* **Baris 3**: `interface Produk {` — Mendeklarasikan interface `Produk`.
* **Baris 4**: `void tampil();` — Deklarasi metode abstrak `tampil()`.
* **Baris 5**: `}` — Penutup interface `Produk`.
* **Baris 7**: `interface Pembayaran {` — Mendeklarasikan interface `Pembayaran`.
* **Baris 8**: `void proses();` — Deklarasi metode abstrak `proses()`.
* **Baris 9**: `}` — Penutup interface `Pembayaran`.
* **Baris 11**: `class Barang implements Produk {` — Mendeklarasikan kelas konkret `Barang` yang mengimplementasikan interface `Produk`.
* **Baris 12-13**: Mendeklarasikan variabel instansi `nama` bertipe `String` dan `harga` bertipe `int`.
* **Baris 15**: `Barang(String nama, int harga) {` — Deklarasi konstruktor `Barang` dengan parameter input data nama dan harga barang.
* **Baris 16-17**: Memetakan data dari parameter ke atribut instansi objek menggunakan keyword `this`.
* **Baris 18**: `}` — Penutup konstruktor `Barang`.
* **Baris 20**: `public void tampil() {` — Implementasi metode `tampil()` dari kontrak interface `Produk`.
* **Baris 21-22**: Perintah keluaran data nama produk beserta harganya.
* **Baris 23**: `}` — Penutup metode `tampil()`.
* **Baris 24**: `}` — Penutup kelas `Barang`.
* **Baris 26**: `class Transfer implements Pembayaran {` — Mendeklarasikan kelas `Transfer` yang mengimplementasikan interface `Pembayaran`.
* **Baris 27**: `public void proses() {` — Implementasi metode `proses()` kelas `Transfer` untuk memproses pembayaran bank.
* **Baris 28**: `System.out.println("Pembayaran via Transfer berhasil");` — Menampilkan notifikasi pembayaran transfer sukses.
* **Baris 29**: `}` — Penutup metode `proses()`.
* **Baris 30**: `}` — Penutup kelas `Transfer`.
* **Baris 32**: `class COD implements Pembayaran {` — Mendeklarasikan kelas `COD` yang mengimplementasikan interface `Pembayaran`.
* **Baris 33**: `public void proses() {` — Implementasi metode `proses()` kelas `COD` untuk memproses pembayaran COD.
* **Baris 34**: `System.out.println("Pembayaran COD saat barang diterima");` — Menampilkan notifikasi info transaksi COD.
* **Baris 35**: `}` — Penutup metode `proses()`.
* **Baris 36**: `}` — Penutup kelas `COD`.
* **Baris 38**: `public class Main {` — Mendeklarasikan kelas utama bernama `Main`.
* **Baris 39**: `public static void main(String[] args) {` — Titik masuk utama program Java.
* **Baris 40**: `Scanner input = new Scanner(System.in);` — Membuat instansi objek pembaca Scanner.
* **Baris 42-43**: Meminta input nama produk bertipe string menggunakan `nextLine()`.
* **Baris 45-46**: Meminta input harga produk bertipe integer menggunakan `nextInt()`.
* **Baris 48**: `Barang b = new Barang(nama, harga);` — Instansiasi objek `Barang` dengan nama dan harga dari input user.
* **Baris 49**: `b.tampil();` — Memanggil metode `tampil()` dari objek produk `b`.
* **Baris 51-52**: Menampilkan pilihan cara bayar dan menampung masukan integer ke variabel lokal `pilih`.
* **Baris 54**: `Pembayaran p;` — Mendeklarasikan variabel referensi `p` bertipe interface `Pembayaran`.
* **Baris 55**: `if (pilih == 1) {` — Memulai percabangan validasi metode pembayaran.
* **Baris 56**: `p = new Transfer();` — Mengisi variabel referensi `p` dengan objek instansi dari kelas `Transfer`.
* **Baris 57**: `} else {` — Jika kondisi bernilai selain 1.
* **Baris 58**: `p = new COD();` — Mengisi variabel referensi `p` dengan objek instansi dari kelas `COD`.
* **Baris 59**: `}` — Batas akhir blok if-else.
* **Baris 61**: `System.out.println("Proses transaksi:");` — Menampilkan teks header transaksi.
* **Baris 62**: `p.proses();` — Menjalankan metode `proses()`. Berkat prinsip polimorfisme, program secara otomatis mengeksekusi implementasi metode yang tepat (apakah milik kelas `Transfer` atau `COD`) sesuai tipe objek nyata yang dirujuk saat runtime.
* **Baris 63**: `}` — Penutup metode `main`.
* **Baris 64**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan10/screenshoot/10-7.png)

<div style="page-break-after: always;"></div>

# Analisis Kode Program Java - Latihan Sesi 11 (Exception Handling)

Dokumen ini berisi analisis baris demi baris serta penjelasan maksud dan tujuan untuk contoh kode Java mengenai konsep Penanganan Eksepsi (Exception Handling).

---

## Latihan 1: Penanganan Pembagian dengan Nol (Try-Catch)

### Kode Sumber

```java
public class Main {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;
            int hasil = a / b;

            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan!");
            System.out.println("Tidak boleh membagi dengan nol.");
        }

        System.out.println("Program selesai.");
    }
}
```

### Maksud dan Tujuan Kode

- **Maksud**: Program ini mendemonstrasikan penanganan kesalahan runtime (eksepsi) bertipe `ArithmeticException` menggunakan struktur blok kontrol `try-catch` ketika program melakukan operasi pembagian integer dengan nol (yang mana secara matematika dan pemrograman adalah operasi ilegal).
- **Tujuan**: Memastikan ketahanan aplikasi (_software robustness_). Dengan dibungkus menggunakan blok `try-catch`, jika terjadi kegagalan operasi matematika di tengah jalan, aplikasi tidak akan mati mendadak secara abnormal (_crash_), melainkan akan menampilkan pesan error secara ramah dan terus melanjutkan instruksi program berikutnya hingga selesai dengan selamat.

### Analisa Per Baris

- **Baris 1**: `public class Main {` — Mendeklarasikan kelas utama publik bernama `Main`.
- **Baris 2**: `public static void main(String[] args) {` — Titik masuk utama program Java (main method) saat dijalankan oleh JVM.
- **Baris 3**: `try {` — Membuka blok `try` untuk menandai area kode yang berpotensi memicu kesalahan runtime (_exception_).
- **Baris 4**: `int a = 20;` — Mendeklarasikan variabel lokal `a` bertipe `int` dan memberinya nilai awal `20`.
- **Baris 5**: `int b = 0;` — Mendeklarasikan variabel lokal `b` bertipe `int` dan memberinya nilai awal `0`.
- **Baris 6**: `int hasil = a / b;` — Melakukan operasi matematika pembagian `a / b` (20 dibagi 0). Karena dalam sistem pembagian integer komputer pembagian dengan nol tidak diperbolehkan, JVM akan melempar (_throw_) objek eksepsi bernama `ArithmeticException`. Baris program di bawahnya dalam blok `try` seketika dihentikan, dan alur kontrol langsung dialihkan ke blok `catch`.
- **Baris 8**: `System.out.println("Hasil: " + hasil);` — Perintah untuk mencetak hasil pembagian. Baris ini terlewati dan **tidak pernah dieksekusi** karena eksepsi sudah terjadi pada baris 6.
- **Baris 9**: `} catch (ArithmeticException e) {` — Menutup blok `try` dan membuka blok `catch` untuk menangkap eksepsi bertipe `ArithmeticException` (direferensikan melalui variabel `e`).
- **Baris 10**: `System.out.println("Terjadi kesalahan!");` — Perintah mencetak pemberitahuan kesalahan ke konsol saat eksepsi berhasil ditangkap.
- **Baris 11**: `System.out.println("Tidak boleh membagi dengan nol.");` — Mencetak pesan edukatif penanganan kesalahan spesifik pembagian nol.
- **Baris 12**: `}` — Penutup blok penanganan eksepsi `catch`.
- **Baris 14**: `System.out.println("Program selesai.");` — Mencetak pesan indikator bahwa program tetap berjalan normal hingga selesai. Baris ini **tetap tereksekusi dengan sukses** karena kesalahan sebelumnya telah ditangani (_handled_) dengan aman, sehingga program tidak mati paksa (_crash_).
- **Baris 15**: `}` — Penutup metode `main`.
- **Baris 16**: `}` — Penutup kelas `Main`.

### Hasil Menjalankan Program (Screenshot)

![Output Program](latihan11/screenshoot/11-1.png)

<div style="page-break-after: always;"></div>

# Analisis Kode Program Java - Latihan Sesi 12 (Peran IDE & Dasar PBO)

## Analisa Soal 1: Peran IDE NetBeans

IDE Java NetBeans berfungsi sebagai lingkungan terpadu untuk menulis, mengorganisasi, meng-compile, dan menjalankan program Java dalam satu aplikasi.

Dibandingkan dengan text editor biasa, NetBeans menyediakan fitur-fitur produktivitas seperti:

- **Syntax Highlighting**: Mempermudah identifikasi elemen kode secara visual.
- **Auto-Complete**: Mempercepat pengetikan dengan saran penulisan kode secara dinamis.
- **Refactoring**: Memudahkan restrukturisasi dan pengorganisasian kode secara aman.
- **Project Management**: Mengelola struktur direktori, kelas, dan dependensi proyek secara visual.
- **Built-in Compiler**: Memungkinkan eksekusi program tanpa harus menggunakan terminal secara manual.

Integrasi dengan debugger, version control, dan template proyek membuat proses pengembangan, pengujian, dan pemeliharaan kode menjadi lebih cepat dan meminimalisir kesalahan.

---

## Analisa Soal 2: Komponen Utama Antarmuka NetBeans

Berikut adalah peran dari masing-masing komponen utama pada IDE NetBeans:

- **Menu Bar**: Berisi menu utama seperti _File_, _Edit_, _View_, _Run_, dan _Tools_ untuk mengakses perintah pembuatan proyek baru, konfigurasi global, dan kontrol eksekusi.
- **Toolbar**: Menyediakan tombol pintas (_shortcut_) untuk aksi yang sering digunakan seperti _Run_, _Debug_, _Save_, dan _Build Project_ guna menghemat waktu.
- **Projects**: Menampilkan struktur logis proyek (_packages_, _classes_, _libraries_) agar pengelolaan kode sumber dan dependensi eksternal menjadi terstruktur.
- **Files**: Menampilkan struktur direktori fisik di komputer (bukan hanya yang terdaftar di proyek), berguna untuk memantau berkas non-kode seperti berkas konfigurasi.
- **Services**: Mengelola integrasi eksternal seperti database (JDBC), server aplikasi (GlassFish, Tomcat), dan API cloud.
- **Source Editor**: Area utama penulisan kode Java yang dilengkapi penomoran baris, deteksi error real-time, dan saran perbaikan (_hints_).
- **Navigator**: Menampilkan daftar kelas, metode, dan variabel dalam berkas aktif untuk mempermudah navigasi dalam berkas kode yang panjang.
- **Output**: Menampilkan hasil kompilasi, status build, keluaran program (`System.out.println`), serta detail error log ketika terjadi _runtime crash_.

---

## Analisa Soal 3: Alur Analisis Error secara Sistematis

Langkah-langkah terstruktur saat menemukan error saat menjalankan program Java di NetBeans:

1.  **Analisis Pesan di Tab Output**: Periksa pesan error, jenis exception, dan cari baris kode spesifik yang dilaporkan bermasalah.
2.  **Navigasi Cepat (Double-Click)**: Klik ganda pada baris error di tab Output untuk langsung mengarahkan kursor ke baris kode yang bermasalah di Source Editor.
3.  **Manfaatkan Debugger**: Pasang _breakpoint_ pada baris sebelum error, lalu jalankan mode Debug dengan navigasi _Step Over_ / _Step Into_ untuk memeriksa nilai variabel di memori.
4.  **Validasi Struktur Paket**: Cek penamaan kelas dan direktori di Navigator dan Projects untuk memastikan deklarasi `package` sudah sesuai.
5.  **Periksa Konfigurasi Proyek**: Jika error berkaitan dengan pustaka (_libraries_) yang tidak ditemukan, buka _Project Properties_ untuk memverifikasi JDK dan dependensi proyek.

---

## Analisa Soal 4: Perbandingan IDE NetBeans, Eclipse, dan IntelliJ IDEA

- **NetBeans**:
  - _Kelebihan_: Sangat ramah pemula, langsung siap pakai tanpa konfigurasi awal yang rumit, dan memiliki GUI Builder Swing yang andal.
  - _Kekurangan_: Pilihan plugin dan dukungan fitur modern/lanjutan lebih terbatas dibandingkan kompetitornya.
- **Eclipse**:
  - _Kelebihan_: Sangat fleksibel dan memiliki ekosistem plugin yang sangat besar dan matang.
  - _Kekurangan_: Pengaturan awal terasa lebih kompleks dan antarmukanya relatif padat.
- **IntelliJ IDEA**:
  - _Kelebihan_: Memberikan analisis kode paling cerdas, navigasi termudah, dan fitur auto-complete yang paling responsif di kelasnya.
  - _Kekurangan_: Versi terlengkap (Ultimate) berbayar, dan membutuhkan konsumsi memori (RAM) yang lebih besar.

**Kesimpulan**: Untuk pemula yang baru belajar Java dasar, NetBeans adalah pilihan yang praktis karena kemudahan penggunaannya. Namun, untuk skala industri atau proyek besar, IntelliJ IDEA dan Eclipse merupakan standar industri yang lebih dominan.

---

## Soal 5: Praktik Program (Proyek LatihanNetBeans)

### Deskripsi Proyek

Proyek baru dibuat pada IDE NetBeans dengan nama **LatihanNetBeans** di bawah _package_ `com.unsiapbo.latihannetbeans`. Program ini menampilkan identitas mahasiswa (Nama, NIM, Program Studi, Fakultas) serta kalimat _"Selamat Belajar Java Menggunakan IDE NetBeans"_.

### Kode Sumber (LatihanNetBeans.java)

```java
package com.unsiapbo.latihannetbeans;

/**
 * @author angga
 */
public class LatihanNetBeans {

    public static void main(String[] args) {
        System.out.println("Selamat Belajar Java Menggunakan IDE NetBeans");
        System.out.println("Dibuat oleh Angga Alfiansah (240101010032)");
        System.out.println("Mahasiswa PJJ Sistem Informasi - Universitas Siber Asia");
    }
}
```

### Bukti Pengerjaan (Screenshots)

Berikut adalah bukti pengerjaan berupa tampilan _Project Structure_, _Source Code_, dan _Output Program_ pada IDE NetBeans:

#### Tampilan Beranotasi (Annotated Screenshot)

![Struktur Proyek, Source Code, dan Output Beranotasi](latihan12/screenshoot/screenshot-1785293361934.png)

#### Tampilan Bersih (Clean Screenshot)

![Struktur Proyek, Source Code, dan Output Bersih](latihan12/screenshoot/screenshot-1785293270517.png)

<div style="page-break-after: always;"></div>

# Analisis Kode Program Java - Latihan Sesi 13 (GUI Swing)
**Implementasi Radio Button dan Combo Box Menggunakan Java Swing**

## 1. Tujuan Praktikum
- Memahami penggunaan komponen `JRadioButton`, `ButtonGroup`, `JComboBox`, dan `JOptionPane` dalam Java Swing.
- Mampu mengelompokkan `JRadioButton` menggunakan `ButtonGroup` sehingga hanya satu pilihan yang dapat dipilih.
- Mampu mengambil nilai dari komponen antarmuka pengguna (GUI) dan menampilkannya sebagai *output* menggunakan dialog pesan (`JOptionPane`).
- Mampu merancang form antarmuka grafis (GUI) yang interaktif, menarik, dan fungsional.

## 2. Langkah Kerja
1. Membuat *project* baru di Java dan menyiapkan kelas `PemesananMinuman` yang mewarisi `JFrame`.
2. Menginisialisasi komponen-komponen UI, antara lain:
   - `JLabel` untuk judul aplikasi dan label masing-masing kategori form.
   - `JRadioButton` untuk pilihan **Jenis Minuman** (Kopi, Teh, Jus) dan **Tingkat Gula** (Tanpa Gula, Sedikit Gula, Gula Normal).
   - `ButtonGroup` untuk mengelompokkan radio button agar sifat pemilihannya *mutually exclusive* (hanya bisa memilih satu).
   - `JComboBox` untuk pilihan **Ukuran Gelas** dan **Topping**.
   - `JButton` untuk aksi ("Proses", "Reset").
3. Mengatur *layout* dengan perpaduan `BorderLayout`, `GridBagLayout`, dan `FlowLayout` serta merapikan form dengan menambahkan padding/batas visual.
4. Menerapkan *System Look and Feel* (`UIManager`) untuk memberikan tampilan form yang rapi, bersih, dan modern sesuai dengan tampilan bawaan sistem operasi.
5. Menambahkan `ActionListener` pada tombol untuk menangkap klik pengguna dan memproses masukan yang diberikan (baik memunculkan *message dialog* maupun me-reset form ke kondisi semula).

## 3. Hasil Praktikum (Dokumentasi UI)

| **Tampilan Awal Program** | **Tampilan Mengisi Form (Bagian 1)** |
| :---: | :---: |
| ![Tampilan Awal Program](latihan13/screenshoot/open.png) | ![Mengisi Form 1](latihan13/screenshoot/fill-1.png) |
| **Tampilan Mengisi Form (Bagian 2)** | **Tampilan Hasil Tombol Proses** |
| ![Mengisi Form 2](latihan13/screenshoot/fill-2.png) | ![Hasil Tombol Proses](latihan13/screenshoot/process.png) |
| **Tampilan Form Setelah Direset** | |
| ![Hasil Tombol Reset](latihan13/screenshoot/reset.png) | |

### Source Code (`PemesananMinuman.java`)


```java
package latihan13;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PemesananMinuman extends JFrame {

    private JLabel lblJudul;

    // Minuman
    private JRadioButton rbKopi;
    private JRadioButton rbTeh;
    private JRadioButton rbJus;
    private ButtonGroup bgMinuman;

    // Ukuran
    private JComboBox<String> cbUkuran;

    // Tingkat gula
    private JRadioButton rbTanpaGula;
    private JRadioButton rbSedikitGula;
    private JRadioButton rbGulaNormal;
    private ButtonGroup bgGula;

    // Topping
    private JComboBox<String> cbTopping;

    // Tombol
    private JButton btnProses;
    private JButton btnReset;

    public PemesananMinuman() {
        setTitle("Form Pemesanan Minuman");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 450);
        setLocationRelativeTo(null);

        // Main panel with padding
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 25, 20, 25));
        mainPanel.setBackground(new Color(245, 245, 255));

        // Judul
        lblJudul = new JLabel("Form Pemesanan Minuman", SwingConstants.CENTER);
        lblJudul.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblJudul.setForeground(new Color(40, 40, 120));
        lblJudul.setBorder(new EmptyBorder(0, 0, 20, 0));
        mainPanel.add(lblJudul, BorderLayout.NORTH);

        // Panel form
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(245, 245, 255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        Font labelFont = new Font("Segoe UI", Font.BOLD, 14);
        Font controlFont = new Font("Segoe UI", Font.PLAIN, 14);

        // Jenis minuman
        JLabel lblMinuman = new JLabel("Jenis Minuman:");
        lblMinuman.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        formPanel.add(lblMinuman, gbc);

        rbKopi = new JRadioButton("Kopi");
        rbTeh = new JRadioButton("Teh");
        rbJus = new JRadioButton("Jus");
        bgMinuman = new ButtonGroup();
        bgMinuman.add(rbKopi);
        bgMinuman.add(rbTeh);
        bgMinuman.add(rbJus);

        JPanel pnlMinuman = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        pnlMinuman.setBackground(new Color(245, 245, 255));
        rbKopi.setFont(controlFont);
        rbKopi.setBackground(new Color(245, 245, 255));
        rbTeh.setFont(controlFont);
        rbTeh.setBackground(new Color(245, 245, 255));
        rbJus.setFont(controlFont);
        rbJus.setBackground(new Color(245, 245, 255));
        pnlMinuman.add(rbKopi);
        pnlMinuman.add(rbTeh);
        pnlMinuman.add(rbJus);

        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(pnlMinuman, gbc);

        // Ukuran
        JLabel lblUkuran = new JLabel("Ukuran Gelas:");
        lblUkuran.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        formPanel.add(lblUkuran, gbc);

        cbUkuran = new JComboBox<>(new String[] { "Small", "Medium", "Large" });
        cbUkuran.setFont(controlFont);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(cbUkuran, gbc);

        // Tingkat gula
        JLabel lblGula = new JLabel("Tingkat Gula:");
        lblGula.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.3;
        formPanel.add(lblGula, gbc);

        rbTanpaGula = new JRadioButton("Tanpa Gula");
        rbSedikitGula = new JRadioButton("Sedikit Gula");
        rbGulaNormal = new JRadioButton("Gula Normal");
        bgGula = new ButtonGroup();
        bgGula.add(rbTanpaGula);
        bgGula.add(rbSedikitGula);
        bgGula.add(rbGulaNormal);

        JPanel pnlGula = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        pnlGula.setBackground(new Color(245, 245, 255));
        rbTanpaGula.setFont(controlFont);
        rbTanpaGula.setBackground(new Color(245, 245, 255));
        rbSedikitGula.setFont(controlFont);
        rbSedikitGula.setBackground(new Color(245, 245, 255));
        rbGulaNormal.setFont(controlFont);
        rbGulaNormal.setBackground(new Color(245, 245, 255));
        pnlGula.add(rbTanpaGula);
        pnlGula.add(rbSedikitGula);
        pnlGula.add(rbGulaNormal);

        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(pnlGula, gbc);

        // Topping
        JLabel lblTopping = new JLabel("Topping:");
        lblTopping.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.3;
        formPanel.add(lblTopping, gbc);

        cbTopping = new JComboBox<>(new String[] { "Tanpa topping", "Bubble", "Jelly", "Cream", "Keju" });
        cbTopping.setFont(controlFont);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(cbTopping, gbc);

        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Tombol
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(new Color(245, 245, 255));
        buttonPanel.setBorder(new EmptyBorder(15, 0, 0, 0));

        btnProses = new JButton("Proses");
        btnProses.setFont(labelFont);
        btnProses.setFocusPainted(false);

        btnReset = new JButton("Reset");
        btnReset.setFont(labelFont);
        btnReset.setFocusPainted(false);

        buttonPanel.add(btnProses);
        buttonPanel.add(btnReset);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners
        btnProses.addActionListener(e -> prosesPesanan());
        btnReset.addActionListener(e -> resetForm());

        add(mainPanel);
    }

    private String getMinuman() {
        if (rbKopi.isSelected())
            return "Kopi";
        if (rbTeh.isSelected())
            return "Teh";
        if (rbJus.isSelected())
            return "Jus";
        return null;
    }

    private String getGula() {
        if (rbTanpaGula.isSelected())
            return "Tanpa Gula";
        if (rbSedikitGula.isSelected())
            return "Sedikit Gula";
        if (rbGulaNormal.isSelected())
            return "Gula Normal";
        return null;
    }

    private void prosesPesanan() {
        String minuman = getMinuman();
        String ukuran = (String) cbUkuran.getSelectedItem();
        String gula = getGula();
        String topping = (String) cbTopping.getSelectedItem();

        if (minuman == null) {
            JOptionPane.showMessageDialog(this,
                    "Silakan pilih jenis minuman!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (gula == null) {
            JOptionPane.showMessageDialog(this,
                    "Silakan pilih tingkat gula!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String pesan = "Pesanan Anda:\n"
                + "Minuman : " + minuman + "\n"
                + "Ukuran  : " + ukuran + "\n"
                + "Gula    : " + gula + "\n"
                + "Topping : " + topping;

        JOptionPane.showMessageDialog(this, pesan,
                "Hasil Pemesanan",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void resetForm() {
        bgMinuman.clearSelection();
        bgGula.clearSelection();
        cbUkuran.setSelectedIndex(0);
        cbTopping.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new PemesananMinuman().setVisible(true);
        });
    }
}
```

## 4. Jawaban Pertanyaan Analisis

**1. Jelaskan fungsi ButtonGroup pada komponen Radio Button!**
Fungsi `ButtonGroup` adalah untuk mengelompokkan beberapa objek `JRadioButton` menjadi satu kesatuan logis di mana hanya **satu tombol yang bisa dipilih pada satu waktu** (*mutually exclusive*). Ketika pengguna memilih salah satu *radio button* dalam grup tersebut, pilihan sebelumnya secara otomatis akan dibatalkan/dihapus (*unselected*).

**2. Mengapa Radio Button lebih tepat digunakan dibandingkan Check Box pada kasus pemilihan jenis minuman?**
Pada pemilihan jenis minuman, pengguna umumnya hanya diperbolehkan memilih **satu jenis minuman saja** untuk satu pesanan (misalnya, tidak bisa memesan "Kopi" dan "Jus" sekaligus tercampur dalam satu gelas). *Radio Button* mewakili logika "pilihan tunggal wajib", sedangkan *Check Box* digunakan untuk kasus "banyak pilihan diperbolehkan" atau "tidak memilih sama sekali diperbolehkan".

**3. Apa fungsi JComboBox pada aplikasi yang telah dibuat?**
Fungsi `JComboBox` dalam aplikasi ini adalah menyediakan pilihan berupa daftar tarik-turun (*dropdown list*) yang sangat hemat ruang tampilan. Pengguna dapat mengklik elemen ini untuk melihat semua daftar pilihan lalu menyeleksi salah satunya (digunakan pada input Ukuran Gelas dan Topping).

**4. Apa yang terjadi apabila Radio Button tidak dimasukkan ke dalam ButtonGroup?**
Apabila `JRadioButton` tidak dimasukkan ke dalam `ButtonGroup`, masing-masing tombol akan bekerja dan berdiri sendiri, sifatnya akan berubah menjadi seperti *check box*. Akibatnya, pengguna dapat **memilih semua *radio button* secara bersamaan** (contoh: bisa memilih Kopi, Teh, dan Jus sekaligus secara bersamaan), yang mana menyebabkan alur logika program salah total.

**5. Bagaimana cara mengambil nilai yang dipilih pada JComboBox menggunakan Java?**
Nilai dari `JComboBox` dapat diambil dengan memanggil metode `.getSelectedItem()`. Karena kembalian nilai aslinya adalah objek generik, maka kita perlu mengkonversi atau meng-*cast* nilainya menjadi tipe data `String`. 
Contoh pengkodean:
```java
String ukuran = (String) cbUkuran.getSelectedItem();
```

**6. Apa fungsi tombol Reset pada aplikasi berbasis form?**
Fungsi tombol "Reset" adalah untuk mengosongkan kembali isi form, membatalkan semua seleksi/pilihan dari pengguna sebelumnya, dan mengembalikan semua keadaan komponen form ke **kondisi awal (*default*)** agar antarmuka form siap digunakan untuk pemasukan data atau pesanan baru tanpa harus menutup dan membuka ulang aplikasi.

**7. Jelaskan perbedaan penggunaan Radio Button dan Combo Box dalam antarmuka pengguna (GUI)!**
- **Radio Button**: Menampilkan semua opsi pilihan secara serentak ke layar secara langsung sehingga mudah dipindai oleh mata pengguna tanpa harus mengeklik (*one-click action*). Sangat tepat untuk kelompok pilihan yang opsinya tidak terlalu banyak (berkisar antara 2 sampai 4 opsi).
- **Combo Box**: Hanya menampilkan opsi yang sedang terpilih, sementara opsi yang lain tersembunyi di daftar *dropdown*. Sangat tepat untuk opsi pilihan yang jumlahnya banyak (lebih dari 4 hingga puluhan, seperti memilh negara, tanggal) untuk sangat menghemat tempat pada tampilan layar.

## 5. Kesimpulan
Berdasarkan praktikum sesi ini, dapat disimpulkan bahwa bahasa pemrograman Java dengan *library* GUI Swing memberikan fasilitas yang lengkap untuk pembuatan aplikasi antarmuka pengguna berbasis formulir (*form based*). Penggunaan komponen yang tepat untuk suatu input amatlah penting (seperti kapan harus memakai *Radio Button* versus *Combo Box*, serta pengaplikasian *ButtonGroup*). Dengan menangkap input, memvalidasinya, dan merespons balik memakai dialog informasi interaktif seperti `JOptionPane`, kita telah menguasai alur kerja fundamental bagaimana sebuah interaksi aplikasi sisi-klien diciptakan.

<div style="page-break-after: always;"></div>

# Analisis Kode Program Java - Latihan Sesi 14 (Koneksi Database MySQL)
**Analisis Koneksi Database MySQL pada Java**

---

**1. Pesan Error "Communications link failure"**
*   **Penyebab:** Error ini berarti aplikasi Java gagal membangun jaring komunikasi dengan server MySQL. Penyebab utamanya bisa berupa: *Service* MySQL (seperti XAMPP) belum dinyalakan, port yang dituju salah atau diblokir oleh *firewall*, atau alamat *host/IP* tujuan tidak valid.
*   **Solusi:** Pastikan aplikasi server MySQL sudah berstatus *Running*. Periksa juga apakah port 3306 terbuka dan konfigurasi host URL (`localhost`) di source code sudah benar.

**2. Tiga Faktor Kegagalan Koneksi (`DriverManager.getConnection`)**
Jika koneksi database gagal dibuat pada sintaks kode di atas, analisis faktor penyebab utamanya adalah:
1.  **Kredensial Salah:** *Username* "root" atau *password* "12345" tidak cocok dengan konfigurasi asli di server MySQL.
2.  **Database Tidak Ditemukan:** Database dengan nama "akademik" belum dibuat di dalam server MySQL.
3.  **Driver JDBC Belum Ada:** Library/Driver konektor MySQL (seperti `mysql-connector-java.jar`) belum ditambahkan ke *classpath/libraries* project Java Anda.

**3. Data Tidak Tersimpan Setelah Tombol "Simpan" Ditekan**
Bagian program yang harus diperiksa agar penyimpanan data berjalan dengan baik:
*   **Action Listener:** Pastikan tombol "Simpan" sudah memiliki *event listener* yang memanggil metode eksekusi ke database.
*   **Sintaks SQL Query:** Periksa apakah perintah `INSERT INTO ...` sudah benar penulisannya dan sesuai dengan jumlah maupun nama kolom di tabel database.
*   **Eksekusi Statement:** Pastikan kode memanggil fungsi `statement.executeUpdate()` setelah query disiapkan.
*   **Penanganan Error (Catch):** Periksa isi dari blok `catch`. Terkadang error tersembunyi karena blok `catch` dibiarkan kosong, sehingga seolah-olah sukses dieksekusi padahal ada data yang gagal disimpan karena ketidakcocokan tipe data.

**4. Keunggulan `PreparedStatement` Dibandingkan `Statement`**
Penggunaan `PreparedStatement` sangat disarankan karena:
*   **Keamanan (Anti SQL Injection):** `PreparedStatement` secara otomatis membersihkan (*escape*) karakter-karakter input berbahaya yang diberikan oleh pengguna, sehingga sangat aman dari peretasan injeksi SQL.
*   **Performa Lebih Baik:** Struktur query pada `PreparedStatement` dikompilasi (*pre-compiled*) oleh database. Jika dieksekusi berulang-kali (misal di dalam *looping* dengan parameter berbeda), prosesnya jauh lebih cepat dan tidak membebani database.

**5. Error "Too many connections"**
*   **Penyebab:** Aplikasi sering membuka koneksi database baru (misalnya setiap kali mengeklik tombol) namun **lupa/tidak pernah menutupnya** kembali. Akibatnya, batas maksimal koneksi simultan pada sistem MySQL penuh sehingga menolak koneksi baru.
*   **Cara Mengatasi:** Selalu pastikan untuk memanggil metode `.close()` pada objek `Connection`, `Statement`, dan `ResultSet` di dalam blok `finally`, atau gunakan sintaks `try-with-resources` (pada Java 7+) agar koneksi tertutup secara otomatis segera setelah penggunaannya selesai.

**6. Aplikasi Berjalan di PC Pengembang, Namun Gagal di Komputer Lain**
Faktor-faktor yang membedakan:
*   **Ketersediaan Database:** Struktur tabel database belum di-*export/import* (di-*dump*) ke komputer tujuan.
*   **Konfigurasi Jaringan (Localhost):** Jika database tetap menempel di PC pengembang, maka komputer klien tidak akan bisa mencarinya jika URL koneksi masih menggunakan `localhost`. Harus menggunakan IP Address PC pengembang, dan user MySQL pengembang harus memberikan hak akses eksternal (*remote access*).
*   **Library Tertinggal:** Driver *MySQL Connector* tidak ikut ter-*build* ke dalam file `.jar` atau foldernya tertinggal di PC tujuan.

**7. Hardcode Username & Password di Source Code**
*   **Dampak Keamanan:** Menulis *password* langsung ke teks program sangatlah rentan. Siapa saja yang mendapatkan *source code* (atau hanya dengan me-*reverse-engineer* file `.class`/`.jar`) bisa langsung melihat kata sandi server dan mencuri data.
*   **Solusi Lebih Baik:** Simpan *username* dan *password* di file konfigurasi eksternal (misalnya `.properties` atau `.env`). File ini dibaca saat *runtime* oleh Java dan dipastikan tidak ikut ter-upload ke repositori *version control* publik (di-*gitignore*).

**8. Alasan Wajib Menggunakan `close()` atau `try-with-resources`**
Koneksi jaringan ke sebuah database adalah *resource* yang memakan banyak memori, baik di sisi *client* Java maupun di server database itu sendiri. Jika tidak ditutup, akan terjadi **Resource Leak** (kebocoran sumber daya). Semakin lama aplikasi berjalan, "koneksi-koneksi hantu" ini akan menumpuk, menyebabkan memori tersita percuma, performa aplikasi melambat pesat, dan berujung pada aplikasi yang *crash* (mengalami *too many connections*).

**9. Keuntungan DBMS dibandingkan Menyimpan Data di File Teks**
*   **Integritas dan Relasi Data:** DBMS memiliki kemampuan menetapkan tipe data wajib dan menjalin relasi antar-tabel (*Primary/Foreign Key*) yang membuat struktur data sangat rapi dan mencegah duplikasi.
*   **Skalabilitas & Kecepatan Akses:** DBMS memakai arsitektur "Indeks". Mencari satu nama mahasiswa spesifik dari jutaan data bisa dilakukan dalam milidetik. Berbeda dengan file teks yang harus dibaca ulang baris demi baris dari awal hingga akhir.
*   **Konkurensi Sistem:** DBMS membolehkan puluhan pengguna melakukan `INSERT/UPDATE` data dalam waktu yang sama persis tanpa merusak format data (*data corruption*). File teks akan langsung rusak jika diedit dua program secara bersamaan.

**10. Data di Tampilan GUI Java Tidak Sesuai (Stale) Setelah Operasi Update**
*   **Kemungkinan Penyebab:** Logika kode SQL `UPDATE` sukses di database, tetapi **tampilan GUI (misal `JTable`) tidak disinkronisasi/di-*refresh***. Komponen GUI masih mengingat data lama yang tersimpan dalam *model* (memori) aplikasinya.
*   **Langkah Mengatasi:** Panggil kembali sebuah fungsi khusus yang bertugas membaca data (`SELECT`) segera setelah fungsi eksekusi `UPDATE` tersebut berhasil. Kosongkan baris pada GUI tabel yang lama (contoh `tableModel.setRowCount(0)`), lalu lemparkan hasil data `SELECT` yang terbaru ke model tersebut agar tampilannya tersinkron dan mutakhir.
