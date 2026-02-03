public class FloatingPointNumber {
    public static void main(String[] args) {
        /*
         * setelah kita membahas mengenai tipe data (integer-number), selanjutnya kita
         * akan membahas mengenai floating-point-number ada 2 di antaranya adalah:
         * 1. float
         * - memiliki ukuran: 32 atau (4 byte)
         * - akurasi 6 - 7 digit desimal
         * - wajib memberikan huruf f dibelakang : 36.7f
         * 
         * 2. double
         * - memiliki kapasaitas 64 bit yang setara dengan (8 byte)
         * - akurasi 15 - 16 digit desimal
         * - tidak perlu menambahkan huruf d di belakang
         * 
         * NB : jika kita menulis angka desimal dan tanpa huruf di belakangnya maka di
         * anggap sebagai floatingNUmber (double)
         */

        // contoh soal berada di KalkulatorSains.java contoh double dan float berapa di
        // dalam file KalkulatorSains.java

        // ada juga yang disebut dengan literals
        int umur = 19;
        int hexaDecimal1 = 0xabc;
        int hexaDecimal = 0xab; // 0xsetelahya angka hexa decimal hasilnya = 171 karena 11 * 16
        // kalau semisal 0xabc 
        // = 10 * 16 * 16
        // = 11 * 16
        // = 12
        // angka 16 tergantung banyaknya angka di kanan dari angka hexa pertama
        int intBin = 0b1010; // 0xsetelahya angka biner

        // kita juga bisa menggunakan underscore saat memberikan nilai kepada variable
        // tanpa merusak isinya, kenapa memakai underscore karena mempermudah mengingat
        // nilai sebuah angka
        int satuJuta = 1_000_000;
        System.err.println(umur);
        System.err.println(hexaDecimal);
        System.err.println(intBin);
        System.err.println(satuJuta);
        System.err.println(2560 + 176 + 12);
        System.err.println(hexaDecimal1);
    }
}