package Week2;

public class ReturnAndVoidMetods {
    public static void main(String[] args) {
        printSum(5, 6);
        System.out.println(sum(5, 6));
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static void printSum(int a, int b) {
        System.out.println(a + b);
        return;
    }
}
