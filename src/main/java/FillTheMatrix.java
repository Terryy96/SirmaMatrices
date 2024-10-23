import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> first = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int number = Integer.parseInt(first.get(0));
        String pattern = first.get(1);

        int[][] matrix3 = new int[number][number];

        if (pattern.equals("A")) {
            fillPatternA(matrix3, number);
        } else if (pattern.equals("B")) {
            fillPatternB(matrix3, number);
        }
        printMatrix(matrix3, number);
    }

        public static void fillPatternA(int[][] matrix, int n) {
            int value = 1;
            for (int col = 0; col < n; col++) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = value;
                    value++;
                }
            }
        }

        public static void fillPatternB(int[][] matrix, int n) {
            int value = 1;
            for (int col = 0; col < n; col++) {
                if (col % 2 == 0) {
                    // Fill column from top to bottom
                    for (int row = 0; row < n; row++) {
                        matrix[row][col] = value;
                        value++;
                    }
                } else {
                    // Fill column from bottom to top
                    for (int row = n - 1; row >= 0; row--) {
                        matrix[row][col] = value;
                        value++;
                    }
                }
            }
        }

        // Method to print the matrix
        public static void printMatrix(int[][] matrix, int n){
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();

        }
    }
}
