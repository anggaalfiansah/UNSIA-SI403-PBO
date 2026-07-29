import java.util.Scanner;

interface User3 {
    void tampil();
}

class Mahasiswa3 implements User3 {
    String nama;
    int umur;

    Mahasiswa3(String n, int u) {
        nama = n;
        umur = u;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class latihan10_3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();

            Mahasiswa3 m = new Mahasiswa3(nama, umur);
            m.tampil();
        }
    }
}