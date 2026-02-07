public class QuiteDeadly {
    public static void main(String[] args) {
        int[][] blackMarket = {
                { 10, 0, 30 },
                { 0, 50, 0 },
                { 70, 0, 90 }
        };
        final char SECURITY_LEVEL = 'B';
        int multiplier;
        int risk = 0;
        System.out.println("=== SCANNING BLACK MARKET DATABASE ===");
        for (int[] row : blackMarket) {
            for (int numberInArray : row) {
                if (numberInArray == 0) {
                    System.out.println("[EMPTY]");
                } else {
                    switch (SECURITY_LEVEL) {
                        case 'A' -> multiplier = 2;
                        case 'B' -> multiplier = 3;
                        default -> multiplier = 1;
                    }
                    int valueOfGoods = numberInArray * multiplier;
                    risk += valueOfGoods;
                    System.out.println("Detected : " + valueOfGoods);
                }
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Total security risk : " + risk);
    }
}
