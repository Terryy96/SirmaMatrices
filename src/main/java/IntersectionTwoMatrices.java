import java.util.Scanner;

public class IntersectionTwoMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrices (M rows, N columns)
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());


        // Initialize the matrices A and B
        char[][] matrixA = new char[rows][cols];
        char[][] matrixB = new char[rows][cols];
        char[][] matrixC = new char[rows][cols];  // This will store the resulting matrix

        // Read matrix A
        for (int i = 0; i < rows; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = inputLine[j].charAt(0);
            }
        }

        // Read matrix B
        for (int i = 0; i < rows; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = inputLine[j].charAt(0);
            }
        }

        // Compute matrix C: compare matrixA and matrixB
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixA[i][j] == matrixB[i][j]) {
                    matrixC[i][j] = matrixA[i][j];  // Intersection: same element
                } else {
                    matrixC[i][j] = '*';  // Different elements: use '*'
                }
            }
        }

        // Print the resulting matrix C
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
