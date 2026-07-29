import java.util.Scanner;

interface Produk7 {
    void tampil();
}

interface Pembayaran7 {
    void proses();
}

class Barang7 implements Produk7 {
    String nama;
    int harga;

    Barang7(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampil() {
        System.out.println("Produk: " + nama);
        System.out.println("Harga: " + harga);
    }
}

class Transfer7 implements Pembayaran7 {
    public void proses() {
        System.out.println("Pembayaran via Transfer berhasil");
    }
}

class COD7 implements Pembayaran7 {
    public void proses() {
        System.out.println("Pembayaran COD saat barang diterima");
    }
}

public class latihan10_7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nama produk: ");
            String nama = input.nextLine();

            System.out.print("Harga: ");
            int harga = input.nextInt();

            Barang7 b = new Barang7(nama, harga);
            b.tampil();

            System.out.println("Pilih pembayaran: 1.Transfer 2.COD");
            int pilih = input.nextInt();

            Pembayaran7 p;
            if (pilih == 1) {
                p = new Transfer7();
            } else {
                p = new COD7();
            }

            System.out.println("Proses transaksi:");
            p.proses();
        }
    }
}