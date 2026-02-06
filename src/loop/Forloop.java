public class Forloop {
    public static void main(String[] args) {
        // contoh perulangan tanpa henti
        /*
         * / *
         * for(init statement; kondisi; post statement){
         * blok perulangan
         * }
         */
        // loopinh dari angka 1 sampai dengan angka 10
        // for (int i = 1; i < 11; i++) {
        // System.out.println("Perulangan ke-" + i);
        // }

        // latihan soal
        // soal 1
        int[] daftarStok = {
                12, 5, 0, 8, 2
        };
        int totalStok = 0;
        System.out.println("Scanning stok barang...");
        for (var i : daftarStok) {
            if (i == 0) {
                System.out.println("Stok: " + i + " -> Peringatan: Ada barang kosong!");
            } else {
                System.out.println("Stok: " + i);
            }
            totalStok += i;
        }
        System.out.println("--------------------------\nTotal Seluruh Stok: " + totalStok);
    }
}
