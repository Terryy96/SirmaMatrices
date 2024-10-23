import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> rowsColumns = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int rows = rowsColumns.get(0);
        int columns = rowsColumns.get(1);

        int[][] matrix1 = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < columns; column++) {
                matrix1[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        int[][] matrix2 = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < columns; column++) {
                matrix2[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        int[][] matrix3 = new int[rows][columns];


        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
