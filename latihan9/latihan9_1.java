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

public class latihan9_1 {
    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.setNama("Budi");
        s.setNilai(85.5);

        System.out.println("Nama Siswa: " + s.getNama());
        System.out.println("Nilai: " + s.getNilai());
    }
}