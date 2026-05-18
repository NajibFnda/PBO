public class MainOverload {

    public static void main(String[] args) {
        System.out.println("Main utama (String[] args)");
        
        main(10); 
        main("Pemrograman Berorentiasi Objek"); 
    }

    public static void main(int angka) {
        System.out.println("Main overload (int) berhasil dipanggil: " + angka);
    }

    public static void main(String teks) {
        System.out.println("Main overload (String) berhasil dipanggil: " + teks);
    }
}