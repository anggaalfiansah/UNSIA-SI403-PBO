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

public class latihan10_2 {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.tampil();
    }
}