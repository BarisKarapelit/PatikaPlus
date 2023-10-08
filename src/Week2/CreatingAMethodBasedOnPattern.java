package Week2;

public class CreatingAMethodBasedOnPattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("N Sayısı: " + n);
        recursiveMethod(n);
    }

    public static void recursiveMethod(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        recursiveMethod(n - 5);

        if (n != 0) {
            System.out.print(n + " ");
        }
    }
}
