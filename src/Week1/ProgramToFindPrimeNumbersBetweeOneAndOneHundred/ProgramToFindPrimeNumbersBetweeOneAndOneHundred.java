package Week1.ProgramToFindPrimeNumbersBetweeOneAndOneHundred;

public class ProgramToFindPrimeNumbersBetweeOneAndOneHundred {
    private  static  Integer number = 100;

    public  static  void findPrimeNumbers() {
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }


}
