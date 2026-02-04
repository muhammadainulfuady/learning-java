package tipeDataBukanPrimitif;

public class BukanPrimitif {
    public static void main(String[] args) {
        // tipe data bukan primitif identik dengan awalan huruf besar misalnya integer
        // menjadi Integer dan default valuenya adalah null bukan
        // contoh soal bukan bagian Character adalah:
        char data1 = '1';
        char data2 = '1';
        // isDigit mengecek data apakah dia itu digit atau bukan
        Boolean hasil1 = Character.isDigit(data1);
        // isLetter mengecek data apakah dia itu huruf a-z atau tidak
        Boolean hasil2 = Character.isDigit(data2);

        // menampilkan hasil 1
        System.out.print(hasil1);
        // menampilkan hasil 2d
        System.out.print(hasil2);
    }
}
