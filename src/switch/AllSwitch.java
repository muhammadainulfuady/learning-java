public class AllSwitch {
    public static void main(String[] args) {
        // switch yield
        String nilaiMahasiswa = "A";
        String nama = switch (nilaiMahasiswa) {
            case "A":
                yield "Kamu lulus nak dengan baik";
            default:
                yield "Salah jurusan";
        };
        System.out.println(nama);

        // switch lambda
        Integer nilaiMahasiswa2 = 10;
        switch (nilaiMahasiswa2) {
            case 10 -> System.out.println("Jancok kon apik poll le");
            default -> {
                System.out.println("Kon iku gak cocok bee sekolahmu mas");
            }
        }

        // switch biasa
        String nilaiMahasiswa3 = "A";
        switch (nilaiMahasiswa3) {
            case "A":
                System.out.println("Kon tak akoni ancen josjis le");
                break;
            case "B":
                System.out.println("Lumayan okelah mas awm");
                break;
            default:
                System.out.println("Awakmu iku salah jurusan bee");
        }
    }
}
