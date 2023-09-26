package Week1.Java101;

public class BasicOperators {
    public static void main(String[] args){
        int a = 5, b= 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8;
        boolean result= a == b;
        boolean result2 = !((a == b) && (c > d));
        System.out.printf("a == b : %b\n", result);
        System.out.printf("!("+a +"== "+b+") && (c > d) : %b\n", result2);
    }
}
