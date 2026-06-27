
public class LatihanMandiri {

    public static void main(String[] args) {

        // Data buku
        String[] judul = {
            "Laskar Pelangi",
            "Bumi",
            "Negeri 5 Menara",
            "Ayat-Ayat Cinta"
        };

        String[] penulis = {
            "Andrea Hirata",
            "Tere Liye",
            "Ahmad Fuadi",
            "Habiburrahman El Shirazy"
        };

        int[] tahunTerbit = {
            2005,
            2014,
            2009,
            2004
        };

        boolean[] dipinjam = {
            true,
            true,
            false,
            true
        };

        // Menampilkan semua buku
        System.out.println("===== DATA BUKU =====");
        tampilkanBuku(judul, penulis, tahunTerbit, dipinjam);

        // Mengembalikan buku
        System.out.println("\nMengembalikan buku : Bumi");
        kembalikanBuku("Bumi", judul, dipinjam);

        // Menampilkan kembali
        System.out.println("\n===== DATA SETELAH DIKEMBALIKAN =====");
        tampilkanBuku(judul, penulis, tahunTerbit, dipinjam);

        // Cari penulis
        System.out.println("\n===== HASIL PENCARIAN =====");
        cariPenulis("Tere Liye", judul, penulis, tahunTerbit, dipinjam);

    }

    // Menampilkan semua buku
    public static void tampilkanBuku(String[] judul, String[] penulis,
                                     int[] tahunTerbit, boolean[] dipinjam) {

        for (int i = 0; i < judul.length; i++) {

            System.out.println("Judul          : " + judul[i]);
            System.out.println("Penulis        : " + penulis[i]);
            System.out.println("Tahun Terbit   : " + tahunTerbit[i]);
            System.out.println("Status         : "
                    + (dipinjam[i] ? "Dipinjam" : "Tersedia"));
            System.out.println("---------------------------");
        }

    }

    // Mengembalikan buku
    public static void kembalikanBuku(String namaBuku,
                                      String[] judul,
                                      boolean[] dipinjam) {

        for (int i = 0; i < judul.length; i++) {

            if (judul[i].equalsIgnoreCase(namaBuku)) {

                dipinjam[i] = false;
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }

        }

        System.out.println("Buku tidak ditemukan.");

    }

    // Mencari berdasarkan penulis
    public static void cariPenulis(String namaPenulis,
                                   String[] judul,
                                   String[] penulis,
                                   int[] tahunTerbit,
                                   boolean[] dipinjam) {

        boolean ditemukan = false;

        for (int i = 0; i < judul.length; i++) {

            if (penulis[i].equalsIgnoreCase(namaPenulis)) {

                ditemukan = true;

                System.out.println("Judul        : " + judul[i]);
                System.out.println("Penulis      : " + penulis[i]);
                System.out.println("Tahun Terbit : " + tahunTerbit[i]);
                System.out.println("Status       : "
                        + (dipinjam[i] ? "Dipinjam" : "Tersedia"));
                System.out.println("----------------------");
            }

        }

        if (!ditemukan) {
            System.out.println("Penulis tidak ditemukan.");
        }

    }

}