public class IntegerNumber {
    public static void main(String[] args) {
        /*
         * kali ini kita akan belajar mengenai tipe data integer-number
         * yang dimana ada 4 tipe. dan untuk masing2 tipe mempunyai rentangnya
         * tersendiri dan juga mempunyai kapasitas memory-nya tersendiri, angka2 ini di
         * hitung dengan rumus seperti yang ada pada nomer 1, dihitung menggunakan
         * sistem bilangan biner.
         * =============================================================================
         * 1. byte
         * - ukuran 8 bit atau (1 byte)
         * - rentang : -128 sampai 127 = -2^(ukuran - 1) sampai (2^(ukuran - 1) - 1)
         * =============================================================================
         * 2. short
         * - ukuran 16 bit atau (2 byte)
         * - rentang : -32.768 sampai 32.767
         * =============================================================================
         * 3. int
         * - ukuran 32 bit atau (3 byte)
         * - rentang : -2.147.483.648 sampai 2.147.483.647
         * =============================================================================
         * 4. long
         * - ukuran 64 bit atau (4 byte)
         * - rentang : Sembilan kuintiliun (angka yang sangat amat panjang!)
         */

        /*
         * latihan soal :
         * 1. Jumlah RT: Ada 15 RT di kampung tersebut.
         * 2. Jumlah Penduduk: Ada 1.250 orang.
         * 3. Target Dana Pembangunan: Kampung butuh dana sebesar Rp 3.000.000.000 (3
         * Miliar).
         * 4. Nomor Registrasi Kampung: 9223372036854775807 (Ini nomor unik yang sangat
         * panjang).
         */

        // program menggunakan byte
        byte rukunTetangga = 15;
        System.out.println(rukunTetangga);

        // program menggunakan short
        short penduduk = 1250;
        System.out.println(penduduk);

        // program menggunakan int
        int danaPembangunan = 300000000;
        System.out.println(danaPembangunan);

        // program menggunakan long
        long regKampung = 92235807;
        System.out.println(regKampung);
    }
}
