package Java101;

public class PwdEkok {
    public static void main(String[] args) {
        int n1 = 20, n2 = 25, ekok = 1, i = 1;

        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("Ekok: " + ekok);
    }
}
