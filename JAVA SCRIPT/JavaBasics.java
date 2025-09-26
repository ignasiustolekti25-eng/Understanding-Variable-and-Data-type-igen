import java.math.BigDecimal;

public class JavaBasics {

    // 1. Money Without Mistakes
    public static void moneyWithoutMistakes() {
        System.out.println("\n=== 1. Money Without Mistakes ===");

        // Versi Double
        double price = 19.99;
        int qty = 3;
        double taxRate = 0.11;

        double subtotal = price * qty;
        double totalDouble = subtotal + (subtotal * taxRate);
        System.out.println("Total (double): " + totalDouble);

        // Versi BigDecimal
        BigDecimal priceBD = new BigDecimal("19.99");
        BigDecimal qtyBD = new BigDecimal("3");
        BigDecimal taxRateBD = new BigDecimal("0.11");

        BigDecimal subtotalBD = priceBD.multiply(qtyBD);
        BigDecimal totalBD = subtotalBD.add(subtotalBD.multiply(taxRateBD));
        System.out.println("Total (BigDecimal): " + totalBD);
    }

    // 2. Type Capacity Puzzle
    public static void typeCapacityPuzzle() {
        System.out.println("\n=== 2. Type Capacity Puzzle ===");

        int students = 1500;            // jumlah siswa
        char firstLetter = 'S';         // huruf pertama nama
        boolean lightSwitch = true;     // lampu ON/OFF
        long planetDistance = 384400000L; // jarak km (contoh: Bumi ke Bulan)

        System.out.println("Jumlah siswa (int): " + students);
        System.out.println("Huruf pertama nama (char): " + firstLetter);
        System.out.println("Lampu ON? (boolean): " + lightSwitch);
        System.out.println("Jarak antar planet (long): " + planetDistance + " km");
    }

    // 3. Unexpected Results with Division
    public static void unexpectedDivision() {
        System.out.println("\n=== 3. Unexpected Results with Division ===");

        int x = 7 / 2;
        double y = 7 / 2;
        double z = 7 / 2.0;

        System.out.println("x (int 7/2) = " + x);
        System.out.println("y (double 7/2) = " + y);
        System.out.println("z (double 7/2.0) = " + z);
    }

    // 4. Literal Confusion
    public static void literalConfusion() {
        System.out.println("\n=== 4. Literal Confusion ===");

        long big = 3000000000L; // harus pakai L
        float f = 2.5f;         // harus pakai f
        char c = 'A';           // harus pakai '

        System.out.println("long big = " + big);
        System.out.println("float f = " + f);
        System.out.println("char c = " + c);
    }

    // 5. Overflow Experiment
    public static void overflowExperiment() {
        System.out.println("\n=== 5. Overflow Experiment ===");

        int max = 2147483647; // Integer.MAX_VALUE
        System.out.println("int max = " + max);
        System.out.println("max + 1 = " + (max + 1));

        long safeMax = 2147483647L;
        System.out.println("Dengan long: " + (safeMax + 1));
    }

    // MAIN METHOD
    public static void main(String[] args) {
        moneyWithoutMistakes();
        typeCapacityPuzzle();
        unexpectedDivision();
        literalConfusion();
        overflowExperiment();
    }
}
