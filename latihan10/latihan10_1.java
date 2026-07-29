interface Kendaraan {
    void bergerak();
}

class Mobil implements Kendaraan {
    public void bergerak() {
        System.out.println("Mobil sedang bergerak");
    }
}

public class latihan10_1 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.bergerak();
    }
}