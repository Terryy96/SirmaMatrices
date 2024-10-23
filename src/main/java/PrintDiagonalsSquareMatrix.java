import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintDiagonalsSquareMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int rowsColumns = first.get(0);

        int[][] matrix1 = new int[rowsColumns][rowsColumns];

        for (int row = 0; row < rowsColumns; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < rowsColumns; column++) {
                matrix1[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        for (int i = 0; i < rowsColumns; i++) {
            System.out.print(matrix1[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < rowsColumns; i++) {
            System.out.print(matrix1[rowsColumns - 1 - i][i] + " ");
        }
        System.out.println();
    }
}
