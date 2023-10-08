package Week2;

public class ArrayMinAndMaxFind {
    public static void main(String[] args) {
        int[] arr = { -30, 2, 60, -70, 5 };
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Min: " + min + "\nMax: " + max);
    }
}
