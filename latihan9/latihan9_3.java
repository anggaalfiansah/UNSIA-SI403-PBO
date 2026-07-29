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

public class latihan9_3 {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        k.setMerk("Toyota");
        k.setTahunProduksi(2023);

        System.out.println("Merk Kendaraan: " + k.getMerk());
        System.out.println("Tahun Produksi: " + k.getTahunProduksi());
    }
}