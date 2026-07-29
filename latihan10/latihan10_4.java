import java.util.Scanner;

interface Kendaraan4 {
    void jalan();
}

class Mobil4 implements Kendaraan4 {
    public void jalan() {
        System.out.println("Mobil berjalan di darat");
    }
}

class Pesawat4 implements Kendaraan4 {
    public void jalan() {
        System.out.println("Pesawat terbang di udara");
    }
}

public class latihan10_4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Pilih kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Pesawat");
            int pilihan = input.nextInt();

            Kendaraan4 k;
            if (pilihan == 1) {
                k = new Mobil4();
            } else {
                k = new Pesawat4();
            }

            k.jalan();
        }
    }
}
