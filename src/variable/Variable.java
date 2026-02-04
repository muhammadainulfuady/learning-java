package variable;

public class Variable {
    public static void main(String[] args) {
        // dalam pembuatan sebuah variable di java kita bisa melakukan dengan 3 cara
        // 1. memberikan nilai langsung kepada variabel nya
        // 2. membuat varible dulu nilainya belakangan
        // 3. menggunakkan keywoard var
        // 4. menggunakan final

        // contoh nomer 1 dan 2
        String name;
        int age = 19;
        name = "Muhammad Ainul Fuady";
        String address = "Indonesia, Jakarta";
        System.out.println("Nama    : " + name);
        System.out.println("Umur    : " + age);
        System.out.println("Alamat  : " + address);

        // contoh nomer 3
        // bisa juga menggunakan keywoard var, var sendiri itu akan tahu type data dari
        // value nya jadi kita sebagai deveoloper tidak perlu memberikan perintah kayak
        // String name = "adi";, jadi langsung var name = "adi";
        // var nim = 240411100009L, maka di anggap sebagai long gitu tapu kasih huruf l
        // di belakang angka nya
        var nim = 240411100009L;
        var faculty = "Teknik";
        var major = "Teknik Informatika";
        System.out.println("Fakultas    : " + faculty);
        System.out.println("Jurusan     : " + major);
        System.out.println("Nim         : " + nim);

        // contoh nomer 4
        // final merupakan variabel yang tidak bisa di ubah kapanpun sampai nanti kiamat
        // bahkan samapi program ini selesai kalau semisal di ubha bakalan eror
        // final String NAMA_KAMPUS = "UNIVERSITAS TRUNODJOYO MADURA"
        // kalau nama kampus di ubah menjadi UNIVERSITAS INDONESIA, maka akan eror

        final String NAMA_KAMPUS = "UNIVERSITAS TRUNODJOYO MADURA";
        System.out.println(NAMA_KAMPUS);
        // NAMA_KAMPUS = "UNIVERSITAS INDONESIA";
        // System.out.println(NAMA_KAMPUS);
    }
}
