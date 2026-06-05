package abstrak;

public class MainInterface {
    public static void main(String[] args) {
        Kotak kotakSaya = new Kotak(4, 5);

        System.out.println("=== SEBELUM RESIZE ===");
        System.out.println("Luas Kotak: " + kotakSaya.getLuas());
        System.out.println("Keliling Kotak: " + kotakSaya.getKeliling());

        kotakSaya.resize(2.0);

        System.out.println("\n=== SETELAH RESIZE 2X ===");
        System.out.println("Luas Kotak: " + kotakSaya.getLuas());
        System.out.println("Keliling Kotak: " + kotakSaya.getKeliling());
    }
}