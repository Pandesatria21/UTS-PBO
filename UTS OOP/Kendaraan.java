public abstract class Kendaraan {
    private String nomorPolisi;
    private String merk;

    public Kendaraan(String nomorPolisi, String merk) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public String getMerk() {
        return merk;
    }

    public abstract void infoKendaraan();
}
