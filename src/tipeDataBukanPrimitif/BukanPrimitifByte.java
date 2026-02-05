
public class BukanPrimitifByte {
    public static void main(String[] args) {
        // ==========================
        // bukan primitif bagian byte
        // ==========================
        /*
         * Konversi dari teks ke angka :
         * Byte.parseByte(teks): Maksa sebuah tulisan (String) jadi angka byte primitif.
         * Byte.valueOf(teks): Mirip parseByte, tapi hasilnya jadi bentuk O
         * -
         * Perubahan tipe casting
         * doubleValue(): Ngerubah angka byte jadi double (angka koma).
         * intValue(): Ngerubah angka byte jadi int (angka bulat yang lebih gede).
         * toString(): Ngerubah angka jadi tulisan/teks lagi.
         * -
         * Cek Batas (Constants)
         * Byte.MAX_VALUE: Bakal kasih tau lu angka tertinggi (127)
         * Byte.MIN_VALUE: Bakal kasih tau lu angka terendah (-128).
         */

        // soal 1
        // parse byte digunakan untuk mengubah data yang awalnya adalah data apapun itu
        // lalu di ubah menjadi byte
        String input = "100";
        // Ubah teks "100" jadi angka byte asli
        byte angka = Byte.parseByte(input);
        System.out.println(angka);

        // soal 2
        // max value sendiri digunakan untuk mengecek tipe data byte ini tuh mampu
        // mencakup sampai angka berapa sih max-nya begitu
        // Tampilkan angka paling gede yang bisa ditampung byte
        System.out.println(Byte.MAX_VALUE);

        // soal 3
        // mengubah data yang awalnya adalah bilangan bulat byte, menjadi angka desimal
        // double
        Byte data = 50;
        // Ubah data byte di atas jadi angka koma (double)
        double hasil = data.doubleValue();
        System.out.println(hasil);

        // soal 4
        // tipe data bukan primitif memiliki nilai default kosong atau null, jika
        // primitif nilai default nya adalah 0 maka bukan primitif adalah null
        // Berikan nilai "kosong" pada tipe data Bukan Primitif ini
        Byte status = null;
        System.out.println(status);

        // soal 5
        Byte skor = 10;
        // Ubah angka 10 jadi tulisan "10"
        String cetak = skor.toString();
        System.out.println(cetak);
    }
}
