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

public class latihan9_2 {
    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank();
        rekening.setNomorRekening("123456789");
        rekening.setSaldo(5000000);

        System.out.println("Nomor Rekening: " + rekening.getNomorRekening());
        System.out.println("Saldo: Rp " + rekening.getSaldo());
    }
}