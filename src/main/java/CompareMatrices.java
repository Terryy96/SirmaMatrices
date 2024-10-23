import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean areEqual = true;

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

        List<Integer> second = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int rows2 = second.get(0);
        int columns2 = second.get(1);
        int[][] matrix2 = new int[rows][columns];

        for (int row = 0; row < rows2; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < columns2; column++) {
                matrix2[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }

        if (rows != rows2 || columns != columns2) {
            System.out.println("not equal");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    areEqual = false;
                    break;
                }
            }
            if (!areEqual) {
                break;
            }
        }
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
