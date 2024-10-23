import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZeroMatrix {

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
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[columns];

        for (int row = 0; row <rows ; row++) {
            for (int column = 0; column <columns ; column++) {
                if (matrix1[row][column] == 0){
                    zeroRows[row] = true;
                    zeroCols[column] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix1[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
