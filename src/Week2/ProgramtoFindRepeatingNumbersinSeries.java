package Week2;

public class ProgramtoFindRepeatingNumbersinSeries {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int[] count = new int[arr.length];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            count[i] = 1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count[i]++;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (count[i] > 1) {
                System.out.println(arr[i] + " is repeated " + count[i] + " times");
            }
        }
    }
}
