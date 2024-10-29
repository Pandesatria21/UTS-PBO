import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pelanggan> pelangganList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Nama Mahasiswa  : Pande Made Satria Praja Dinatha");
        System.out.println("NIM             : 2215101045");

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaPelanggan);

        boolean tambahLagi = true;
        while (tambahLagi) {
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Tambah Motor");
            System.out.print("Pilih jenis kendaraan yang akan disewa: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Masukkan nomor polisi: ");
            String nomorPolisi = scanner.nextLine();
            System.out.print("Masukkan merk kendaraan: ");
            String merk = scanner.nextLine();

            Kendaraan kendaraan;
            if (pilihan == 1) {
                kendaraan = new Mobil(nomorPolisi, merk);
            } else {
                kendaraan = new Motor(nomorPolisi, merk);
            }

            pelanggan.tambahKendaraan(kendaraan);

            System.out.print("Tambah kendaraan lagi? (y/n): ");
            tambahLagi = scanner.nextLine().equalsIgnoreCase("y");
        }

        pelangganList.add(pelanggan);

        System.out.println("Data Peminjam:");
        for (Pelanggan p : pelangganList) {
            p.displayKendaraanDisewa();
        }


        System.out.print("Masukkan nomor polisi untuk cek ketersediaan: ");
        String nomorPolisiCek = scanner.nextLine();
        boolean tersedia = pelanggan.cekKetersediaanKendaraan(nomorPolisiCek);
        System.out.println("Ketersediaan kendaraan dengan nomor polisi " + nomorPolisiCek + ": " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }
}
