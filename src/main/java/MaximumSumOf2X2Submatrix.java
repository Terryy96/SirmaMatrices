import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int rows = first.get(0);
        int columns = first.get(1);

        int[][] matrix1 = new int[rows][columns];


        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < columns; column++) {
                matrix1[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns - 1; j++) {
                int currentSum = matrix1[i][j] + matrix1[i][j + 1] +
                        matrix1[i + 1][j] + matrix1[i + 1][j + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestRow = i;
                    bestCol = j;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(matrix1[bestRow][bestCol] + " " + matrix1[bestRow][bestCol + 1]);
        System.out.println(matrix1[bestRow + 1][bestCol] + " " + matrix1[bestRow + 1][bestCol + 1]);


    }
}
