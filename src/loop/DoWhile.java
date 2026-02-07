public class DoWhile {
    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("=== MENU GUDANG ===");
            System.out.println("1. Cek Barang");
            System.out.println("2. Keluar");

            // Anggap saja user langsung milih keluar (pilihan = 2)
            pilihan = 2;

        } while (pilihan != 2);

        System.out.println("Terima kasih sudah mampir!");
    }
}
