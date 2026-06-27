package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    // Menampilkan semua mahasiswa
    public void tampilkanSemua() {

        System.out.println("===== DATA MAHASISWA =====");

        for (Mahasiswa m : daftarMahasiswa) {
            m.info();
        }

    }

    // Menghitung rata-rata
    public double hitungRataRata() {

        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();

    }

    // Menghitung jumlah lulus
    public int jumlahLulus() {

        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {

            if (m.lulus()) {
                jumlah++;
            }

        }

        return jumlah;
    }

    // Jumlah mahasiswa
    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

}