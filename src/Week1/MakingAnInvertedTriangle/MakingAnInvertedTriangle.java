package Week1.MakingAnInvertedTriangle;

public class MakingAnInvertedTriangle {
    private static Integer digits;
    public static void setDigits(Integer digits) {
        MakingAnInvertedTriangle.digits = digits;
    }
    public static void printInvertedTriangle() {
        System.out.println("Inverted Triangle");
        System.out.println("===============");
        System.out.println("Enter the number of digits: ");
        setDigits(new java.util.Scanner(System.in).nextInt());
        for (int i = digits; i > 0; i--) {
            for (int j = 0; j < digits - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
