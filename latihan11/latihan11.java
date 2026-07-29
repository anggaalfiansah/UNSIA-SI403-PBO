public class latihan11 {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;
            int hasil = a / b;

            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan!");
            System.out.println("Tidak boleh membagi dengan nol.");
        }

        System.out.println("Program selesai.");
    }
}