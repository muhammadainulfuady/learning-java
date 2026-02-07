public class MethodParamReturn {
    public static void main(String[] args) {
        /*
         * latihan soal
         * 📦 KASUS: THE LOGISTICS TAX ENGINE
         */

        double result = calculateFinalCost(50, 2000, 0.1);
        System.out.println("Total biaya pengiriman: " + result);
        if (result > 100_000) {
            System.out.println("Status: Pengiriman Prioritas");
        } else {
            System.out.println("Status: Pengiriman Reguler");
        }

    }

    public static double  calculateFinalCost(int beratBarang, int hargaBarang, double persenPajak) {
        int biayaAwal = beratBarang * hargaBarang;
        double nilaiPajak = biayaAwal * persenPajak;
        double total = biayaAwal + nilaiPajak;
        return total;
    };
}
