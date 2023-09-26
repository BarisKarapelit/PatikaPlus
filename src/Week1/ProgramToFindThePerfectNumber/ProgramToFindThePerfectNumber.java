package Week1.ProgramToFindThePerfectNumber;

public class ProgramToFindThePerfectNumber {
    private static int number;
    public static  void setNumber(int number){
        ProgramToFindThePerfectNumber.number = number;
    }
    public static int getNumber(){
        return number;
    }
    public static void main(String[] args) {
        System.out.println("Program to find the perfect number");
        System.out.println("Enter the number");
        setNumber(new java.util.Scanner(System.in).nextInt());
        int sum = 0;
        for(int i = 1; i < getNumber(); i++){
            if(getNumber() % i == 0){
                sum += i;
            }
        }
        if(sum == getNumber()){
            System.out.println(getNumber() + " is a perfect number");
        }else{
            System.out.println(getNumber() + " is not a perfect number");
        }
    }

}
