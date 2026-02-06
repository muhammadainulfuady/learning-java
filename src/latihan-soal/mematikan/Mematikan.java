public class Mematikan {
    public static void main(String[] args) {
        /*
         * 🚨 SOAL: THE WAREHOUSE GATEKEEPER
         */

        final String idGerbang = "GATE-7A";

        Integer[][] tabelTarif = {
                { 100, 200 },
                { 300, 400 }
        };

        String teksBerat = "150";
        String teksIzin = "true";
        int beratInt = Integer.parseInt(teksBerat);
        boolean izinBool = Boolean.parseBoolean(teksIzin);
        Integer indexID = idGerbang.length() - 1;
        char idGerbangTerakhir = idGerbang.charAt(indexID);
        int biayaTambahan;

        switch (idGerbangTerakhir) {
            case 'A' -> biayaTambahan = 50;
            case 'B' -> biayaTambahan = 100;
            default -> {
                biayaTambahan = 10;
            }
        }

        Integer getArray = tabelTarif[1][1];

        Integer totalNilai = (beratInt + getArray) - biayaTambahan;

        System.out.println("===== LOGISTIC GATE SYSTEM: GATE-7A =====");
        System.out.println("Berat Terdeteksi    : " + beratInt + " Kg");
        System.out.println("Biaya Tambahan      : " + biayaTambahan);
        System.out.println("Total Nilai Skor    : " + totalNilai);
        System.out.println("-----------------------------------------");
        if (izinBool && totalNilai > 400) {
            System.out.println("STATUS GERBANG : SILAKAN MASUK!");
        } else {
            System.out.println("STATUS GERBANG : JANGAN MASUK!");
        }
    }
}
