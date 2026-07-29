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

public class latihan9_4 {
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
