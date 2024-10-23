import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RowSumColumnSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int rows = first.get(0);
        int columns = first.get(1);

        int[][] matrix1 = new int[rows][columns];

        int[] rowSums = new int[rows];
        int[] colSums = new int[columns];

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < columns; column++) {
                matrix1[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSums[i] += matrix1[i][j];
                colSums[j] += matrix1[i][j];
            }
        }

        List<Integer> finalRowSums = new ArrayList<>();
        List<Integer> finalColumnSums = new ArrayList<>();

        for (int i = 0; i < rowSums.length; i++){
            finalRowSums.add(rowSums[i]);
        }

        for (int i = 0; i < colSums.length; i++){
            finalColumnSums.add(colSums[i]);
        }


            System.out.print("Row Sums: " + finalRowSums);
            System.out.println();
            System.out.print("Column Sums: " + finalColumnSums);

    }
}
