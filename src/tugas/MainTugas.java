/*
Nama : Agiel Munawar
NPM  : 2410010539
*/

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array Mata Kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Jaringan Komputer"
        };

        System.out.println("===== DAFTAR MATA KULIAH =====");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Minimal 5 Mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Agiel Munawar", "2410010539", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2410010540", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010541", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010542", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "2410010543", 40));

        // Menampilkan data
        kelas.tampilkanSemua();

        // Rata-rata nilai
        System.out.println("Rata-rata Nilai : " + kelas.hitungRataRata());

        // Jumlah lulus
        System.out.println("Jumlah Lulus    : " + kelas.jumlahLulus());

        // Menambah mahasiswa baru
        System.out.println("\nMenambah Mahasiswa Baru...\n");

        kelas.tambahMahasiswa(new Mahasiswa("Elsa", "2410010544", 95));

        // Menampilkan kembali
        kelas.tampilkanSemua();

        // Jumlah data terbaru
        System.out.println("Jumlah Mahasiswa Sekarang : "
                + kelas.jumlahMahasiswa());

    }

}