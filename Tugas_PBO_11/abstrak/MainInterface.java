package abstrak;

public class MainInterface {
    public static void main(String[] args) {
        // a. Mendefinisikan objek kotak (panjang = 4, lebar = 5)
        Kotak kotakSaya = new Kotak(4, 5);

        // b. Cetak luas dan keliling objek (Sebelum diubah)
        System.out.println("=== SEBELUM RESIZE ===");
        System.out.println("Luas Kotak: " + kotakSaya.getLuas());
        System.out.println("Keliling Kotak: " + kotakSaya.getKeliling());

        // c. Ubah ukuran panjang dan lebar sebesar 2x
        kotakSaya.resize(2.0);

        // d. Cetak kembali luas dan keliling objek (Setelah diubah)
        System.out.println("\n=== SETELAH RESIZE 2X ===");
        System.out.println("Luas Kotak: " + kotakSaya.getLuas());
        System.out.println("Keliling Kotak: " + kotakSaya.getKeliling());
    }
}