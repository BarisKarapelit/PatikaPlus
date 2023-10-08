package Week2;


public class ACharDrawWithStar {
    public static void main(String[] args) {
        Integer[][] a = new Integer[6][4];

        // Initialize the inner arrays
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 0;  // Initialize all elements to 0
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0 || i == 2) {
                    a[i][j] = 1;
                } else if (j == 0 || j == 3) {
                    a[i][j] = 1;
                }else if (i == 5 && j == 2) {
                    a[i][j] = 1;
                }else if (i == 5 && j == 1) {
                    a[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move this inside the outer loop
        }
    }
}
