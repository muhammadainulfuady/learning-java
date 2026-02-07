package method.methodVarags;

public class VariableArg {
    public static void main(String[] args) {
        cetakStruk("Ainul Fuady", 10, 20_000, 30_000, 50_000);
    }

    public static void cetakStruk(String namaPelanggan, int diskon, int... hargaBaru) {
        int totalHarga = 0;
        for (int sum : hargaBaru) {
            totalHarga += sum;
        }
        int potonganHarga = (totalHarga * diskon / 100);
        int totalBayar = (totalHarga - potonganHarga);
        System.out.println("Pelanggan       : " + namaPelanggan);
        System.out.println("Diskon          : " + diskon + "%");
        System.out.println("--------------------------");
        System.out.println("Total Awal      :" + totalHarga);
        System.out.println("Potongan        :" + potonganHarga);
        System.out.println("Total bayar     :" + totalBayar);
    }
}
