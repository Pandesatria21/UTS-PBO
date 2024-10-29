import java.util.ArrayList;

public class Rental {
    private ArrayList<Kendaraan> daftarKendaraan;

    public Rental() {
        daftarKendaraan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }
}
