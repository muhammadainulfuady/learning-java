public class Ternary {
    public static void main(String[] args) {
        // nilai lulus harus di atas 75
        Integer nilaiMahasiswa = 80;
        System.out.println("Menggunakan if dan else :");
        if (nilaiMahasiswa >= 75) {
            System.out.println("Anda dinyatakan lulus.");
        } else {
            System.out.println("Anda ngulang tahun depan.");
        }
        System.out.println("\nMenggunakan ternary operator :");

        String result = nilaiMahasiswa >= 75 ? "Anda dinyatakan lulus" : "Anda ngulang tahun depan";
        System.out.println(result);
    }
}
