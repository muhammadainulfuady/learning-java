package array;

public class LearnArray {
    public static void main(String[] args) {
        /*
         * cara membuat array biasa pada program java:
         * 1. tentukan tipe datanya terlebih dahulu
         * 2. berikan nama variabel nya
         * 3. dan tentukan array itu mau di isi berapa data
         */
        Integer[] data = new Integer[3];
        data[0] = 10;
        data[1] = 10;
        data[2] = 10;
        System.out.println(data[0]);

        /*
         * arrray initializer: sebenarnya array initializer(-) ini pada umumnya yah
         * memang seperti array biasa yang membedakan adalah kalau, - bisa di singkat
         * kodenya jadi kita tidak perlu mengisikan 1 persatu index berapa di isi apa,
         * lalau array itu mau ada berapa data
         */

        // lebih simple
        String[] namaGuwah = {
                "Muhammad", "Ainul", "Fuady"
        };
        System.out.println(namaGuwah[0]);

        // lumayan simple
        Integer[] ganjil = new Integer[] {
                1, 3, 5, 7, 9
        };
        System.out.println(ganjil[2]);
        /*
         * nah kapan kita menggunakan array biasa atau array initializer
         * 1. array biasah
         * saat kita sudah tahu persis datanya ada berapa, misalnya murid disekolah ada
         * 30
         * 2. array initializer
         * disaat kita tidak tahu persis datanya ada berapa, misalnya buat nyimpen data
         * inputan dari user, kan kita tidak tahu persis ada berapa user yang masuk ke
         * dalam web kita
         * 
         * NB : Jadi gunakan yang terbaik dan sesuai dengan kebutuhan yahhhh
         */

        /*
         * cara membuat array 2d atau 2 dimensis
         */

        // normal dan mudah banget
        Integer[][] membersAdmin = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
        Integer[] membersUsers = membersAdmin[0];
        System.out.println(membersUsers[0]);

        // sedikit normal dan tidak mudah2 banget yah
        Integer[][] ganjil2 = new Integer[3][2];
        ganjil2[0][0] = 1;
        ganjil2[0][1] = 2;
        ganjil2[1][0] = 3;
        ganjil2[1][1] = 4;
        ganjil2[2][0] = 5;
        ganjil2[2][1] = 6;
        System.out.println(ganjil2.length);
    }

    // testing
    int[][] data = {
            { 10, 20 },
            { 30, 40, 50 }
    };

}
