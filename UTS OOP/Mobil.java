public class Mobil extends Kendaraan {
    public Mobil(String nomorPolisi, String merk) {
        super(nomorPolisi, merk);
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Kendaraan: Mobil, Merk: " + getMerk() + ", Nomor Polisi: " + getNomorPolisi());
    }
}
