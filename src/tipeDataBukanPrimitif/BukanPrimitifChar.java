package tipeDataBukanPrimitif;

public class BukanPrimitifChar {
    public static void main(String[] args) {
        // tipe data bukan primitif identik dengan awalan huruf besar misalnya integer
        // menjadi Integer dan default valuenya adalah null bukan
        // contoh soal bukan bagian Character adalah:
        // contoh latihan soal

        // ==========================
        // bukan primitif bagian char
        // ==========================

        // soal 1
        // is digit itu ibaratnya kita cek apakah data itu angka atau tidak dari 0-9
        char data = '9';
        boolean hasil = Character.isDigit(data); // Isi dengan jurus cek angka
        // Output yang diharapkan: true
        System.out.println(hasil);

        // soal 2
        // is letter digunkan untuk mengecek apakah simbol itu huruf atau tidak jadi di
        // cek dari huruf a-z
        char simbol = '&';
        boolean isHuruf = Character.isLetter(simbol); // Isi dengan jurus c
        // Output yang diharapkan: false
        System.out.println(isHuruf);

        // soal 3
        // mengubah huruf yang awalnya lower menjadi upper
        char kecil = 'm';
        char besar = Character.toUpperCase(kecil); // Isi dengan jurus ubah ke besar
        // Output yang diharapkan: M
        System.out.println(besar);

        // soal 4
        // mengubah huruf yang awalnya upper menjadi lower
        char cek = 'A';
        boolean status = Character.isLowerCase(cek); // Isi dengan jurus cek huruf kecil
        // Output yang diharapkan: false
        System.out.println(status);

        // soal 5
        // mengecek apakah ada spasi
        char tombol = ' ';
        boolean kosong = Character.isWhitespace(tombol); // Isi dengan jurus cek spasi (whitespace)
        // Output yang diharapkan: true
        System.out.println(kosong);

        // soal 6
        // mengubah huruf menjadi lower
        char kapital = 'Z';
        char kecil2 = Character.toLowerCase(kapital); // Isi dengan jurus ubah ke kecil
        // Output yang diharapkan: z
        System.out.println(kecil2);

        // soal 7
        // mengecek apakah huruf itu kecil atau besar
        char huruf = 'K';
        boolean hasil2 = Character.isUpperCase(huruf); // Isi dengan jurus cek huruf besar
        // Output yang diharapkan: true
        System.out.println(hasil2);

        // soal 8
        // memberikan nilai default yaitu null karena tipe data bukan primitif memiliki
        // atribut null
        Character data2 = null; // Isi dengan nilai "kosong" untuk tipe bukan primitif
        // Output yang diharapkan: null
        System.out.println(data2);

        // soal 9
        char input = '#';
        boolean valid = Character.isLetterOrDigit(input);
        // Apa isi variabel 'valid'? tulis jawabannya di sini: _____
        // harusnya sih false yah soalenya kan itu bukan huruf maupun digit keduanya
        // tidak terpenuhi makanya salah atau false
        System.out.println(valid);

        // soal 10
        Character c1 = 'A';
        Character c2 = 'a';
        boolean sama = c1.equals(c2);
        // Apa isi variabel 'sama'? tulis jawabannya di sini: _____
        System.out.println(sama);
    }
}
