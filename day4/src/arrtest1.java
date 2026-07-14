public class arrtest1 {
    public static void main(String[] args) {

        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // PRINT MATRIX
        System.out.println("Matrix is:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // CALCULATE SUM
        int sum = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }

        System.out.println("Sum of matrix = " + sum);
    }
}