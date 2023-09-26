package Week1.FindingMinAndMaxValuesFromEnteredNumbers;

public class FindingMinAndMaxValuesFromEnteredNumbers {
    private static int min;
    private static int max;
    private static int[] number;

    public static void setNumber(int[] number) {
        FindingMinAndMaxValuesFromEnteredNumbers.number = number;
    }
    public static int[] getNumber() {
        return number;
    }
    public static void findMinAndMaxValues() {
        min = number[0];
        max = number[0];
        // Finding min and max values
        for (int i = 0; i < number.length; i++) {
            // If number[i] is less than min, then min = number[i]
            if (number[i] < min) {
                min = number[i];
                System.out.println("Min value is: " + min);
            }
            // If number[i] is greater than max, then max = number[i]
            if (number[i] > max) {
                max = number[i];
                System.out.println("Max value is: " + max);
            }
        }
    }
}
