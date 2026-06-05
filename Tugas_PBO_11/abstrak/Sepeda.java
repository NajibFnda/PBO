package abstrak;

public class Sepeda extends Kendaraan {
    private boolean isAuto;

    public Sepeda(boolean isAuto) {
        this.isAuto = isAuto;
    }

    public void jenis() {
        if (isAuto) {
            System.out.println("Sepeda otomatis");
        } else {
            System.out.println("Sepeda kayuh");
        }
    }

    @Override
    public void nyalakan() {
        System.out.println("Sepeda siap digunakan untuk perjalanan.");
    }
}