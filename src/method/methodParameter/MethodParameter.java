public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Ainulfuady");
        tambah(20, 30);
        ulangiKata("Java", 3);
    }

    static void sayHello(String nama) {
        System.out.println("Hello, " + nama);
    }

    static void tambah(int a, int b) {
        System.out.println(a + b);
    }

    static void ulangiKata(String kata, int jumlah) {
        for (int iteration = 0; iteration < jumlah; iteration++) {
            System.out.println(kata);
        }
    }
}
