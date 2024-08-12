import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        int[][] arr3 = new int[3][3];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of two matrices: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(" " + arr3[i][j]);


            }
            System.out.println();
        }
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr4[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println("Multiplication of two Matrices: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(" " + arr4[i][j]);


            }
            System.out.println();

        }
    }
}
