package abstrak;

public class MainBangunDatar {
    public static void main(String[] args) {
        Kotak kotakSaya = new Kotak(6, 4);
        System.out.println("KOTAK");
        System.out.println("Jumlah Sisi: " + kotakSaya.getJumlahSisi());
        System.out.println("Luas Kotak: " + kotakSaya.getLuas());
        System.out.println("Keliling Kotak: " + kotakSaya.getKeliling());
        kotakSaya.draw();

        System.out.println();

        Segitiga segitigaSaya = new Segitiga(6, 8);
        System.out.println("SEGITIGA");
        System.out.println("Jumlah Sisi: " + segitigaSaya.getJumlahSisi());
        System.out.println("Luas Segitiga: " + segitigaSaya.getLuas());
        System.out.println("Keliling Segitiga: " + segitigaSaya.getKeliling());
        segitigaSaya.draw();
    }
}