import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> rowsColumns = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int rowsCol = rowsColumns.get(0);

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        int[][] matrix1 = new int[rowsCol][rowsCol];

        for (int row = 0; row < rowsCol; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < rowsCol; column++) {
                matrix1[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }
        for (int i = 0; i < rowsCol; i++) {
            diagonalSum1+=matrix1[i][i];
            System.out.println(matrix1[i][i]);
            diagonalSum2+=matrix1[i][rowsCol - 1 - i];
            System.out.println(matrix1[i][rowsCol - 1 - i]);
        }

        System.out.println(diagonalSum1+diagonalSum2);
    }
}
