public class Method {
    public static void main(String[] args) {
        garisPembatas();
        sayHello();
        tampilkanNama();
        hitungSimpel();
        pagi();
        siang();
        malam();
        garisPembatas();
    }

    static void sayHello() {
        System.out.println("Halo dunia Java!");
    }

    static void garisPembatas() {
        System.out.println("====================");
    }

    static void tampilkanNama() {
        String nama = "Halo Ainulfuady";
        System.out.println(nama);
    }

    static void hitungSimpel() {
        int a = 10;
        int b = 5;
        System.out.println(a + b);
    }

    static void pagi() {
        System.out.println("Matahari terbit.");
    }

    static void siang() {
        System.out.println("Matahari di atas kepala.");
    }

    static void malam() {
        System.out.println("Bulan muncul.");
    }
}
