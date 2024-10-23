import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatrixBoundarySum {

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
        int boundarySum = 0;

        for (int j = 0; j < columns; j++) {
            boundarySum += matrix1[0][j];
            if (rows > 1) {
                boundarySum += matrix1[rows - 1][j];
            }
        }

        for (int i = 1; i < rows - 1; i++) {
            boundarySum += matrix1[i][0];
            if (columns > 1) {
                boundarySum += matrix1[i][columns - 1];
            }
        }
        System.out.println(boundarySum);

    }
}
