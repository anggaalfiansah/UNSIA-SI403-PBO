import java.util.Scanner;

interface Keranjang6 {
    int hitungTotal();
}

class Item6 implements Keranjang6 {
    int harga;
    int qty;

    Item6(int h, int q) {
        harga = h;
        qty = q;
    }

    public int hitungTotal() {
        return harga * qty;
    }
}

public class latihan10_6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Harga barang: ");
            int harga = input.nextInt();

            System.out.print("Jumlah beli: ");
            int qty = input.nextInt();

            Item6 i = new Item6(harga, qty);
            System.out.println("Total belanja: " + i.hitungTotal());
        }
    }
}