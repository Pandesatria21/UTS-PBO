public class Motor extends Kendaraan {
    public Motor(String nomorPolisi, String merk) {
        super(nomorPolisi, merk);
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Kendaraan: Motor, Merk: " + getMerk() + ", Nomor Polisi: " + getNomorPolisi());
    }
}
