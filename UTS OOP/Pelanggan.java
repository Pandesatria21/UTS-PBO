import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private ArrayList<Kendaraan> kendaraanDipinjam;

    public Pelanggan(String nama) {
        this.nama = nama;
        this.kendaraanDipinjam = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanDipinjam.add(kendaraan);
        System.out.println(nama + " telah meminjam kendaraan: " + kendaraan.getNomorPolisi());
    }

    public void displayKendaraanDisewa() {
        System.out.println("Pelanggan: " + nama);
        for (Kendaraan kendaraan : kendaraanDipinjam) {
            kendaraan.infoKendaraan();
        }
    }

    public boolean cekKetersediaanKendaraan(String nomorPolisi) {
        for (Kendaraan kendaraan : kendaraanDipinjam) {
            if (kendaraan.getNomorPolisi().equalsIgnoreCase(nomorPolisi)) {
                return true;
            }
        }
        return false; 
    }
}
