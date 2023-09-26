package Week2;

public class Metods {
    public static void main(String[] args) {
        int base = 2, exponent = 3;
        System.out.println("Result: " + power(base,exponent));


    }
    static int power(int base, int exp){
        int result = 1;
        for (int i = 1;i<= exp ;i++){
            result = result * base;
        }
        return result;
    }
}
