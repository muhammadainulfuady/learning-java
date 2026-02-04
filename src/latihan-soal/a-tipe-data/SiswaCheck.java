public class SiswaCheck {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        int absen = 10;
        boolean isLulus = nilaiUjian > 75 && absen < 12;
        System.out.println("Apakah sisaw lulus : " + isLulus);
    }
}
