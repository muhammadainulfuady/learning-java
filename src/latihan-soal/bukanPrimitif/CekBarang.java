public class CekBarang {
    public static void main(String[] args) {
        final String idGudang = "GDG-77";
        String berat = "85";
        byte beratToByte = Byte.parseByte(berat);
        String[] barang = new String[3];
        barang[0] = "Elektronik";
        barang[1] = "Perabotan";
        barang[2] = "Alat Medis";

        String kategori = barang[0];
        Character hurufAwal = kategori.charAt(0);
        boolean checkUpper = Character.isUpperCase(hurufAwal);
        boolean status = beratToByte < 100 && kategori != null;
        System.out.println("--- Laporan gudang: " + idGudang + " ---");
        System.out.println("Kategori Utama      : " + kategori);
        System.out.println("Berat Barang        : " + berat + " Kg");
        System.out.println("Huruf Awal '" + hurufAwal + "' adalah Kapital : " + checkUpper);
        System.out.println("Status Layak Jalan  : " + status);
    }
}
