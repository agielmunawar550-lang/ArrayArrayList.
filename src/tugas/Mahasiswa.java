package tugas;

public class Mahasiswa {

    private String nama;
    private String npm;
    private double nilai;

    // Constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method lulus
    public boolean lulus() {
        return nilai >= 60;
    }

    // Menampilkan data
    public void info() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Nilai : " + nilai);
        System.out.println("Status: " + (lulus() ? "Lulus" : "Tidak Lulus"));
        System.out.println("----------------------------");
    }
}