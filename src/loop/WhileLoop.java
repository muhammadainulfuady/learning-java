public class WhileLoop {
    public static void main(String[] args) {
        int correctPin = 1234;
        int pinInput = 0;
        int test = 0;
        int maximumLimit = 3;

        System.out.println("Memulai sistem keamanan...");
        while (pinInput != correctPin && test < maximumLimit) {
            System.out.println("Percobaan ke: " + (++test) + ": PIN Salah!");
            if (test == maximumLimit) {
                pinInput = 1234;
            }

        }
        System.out.println("--------------------------");
        if (pinInput == correctPin) {
            System.out.println("AKSES DITERIMA! Selamat Datang.");
        } else {
            System.out.println("AKSES DITOLAK! Akun Terkunci.");
        }
    }
}
