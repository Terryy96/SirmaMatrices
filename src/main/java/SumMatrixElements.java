import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumMatrixElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int rows = first.get(0);
        int columns = first.get(1);
        int rowCount=0;
        int columnCount=0;
        int sumElements=0;

        int[][] matrix1 = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < columns; column++) {
                matrix1[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        for (int row = 0; row <rows ; row++) {
            rowCount++;
        }

        for (int i = 0; i <columns ; i++) {
            columnCount++;
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                sumElements+=matrix1[i][j];
            }
        }

        System.out.println(rowCount);
        System.out.println(columnCount);
        System.out.println(sumElements);
    }
}
