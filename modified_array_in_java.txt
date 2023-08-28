import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the dimensions of the array
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = input.nextInt();
        // Initialize the array
        int[][] arr = new int[n][m];
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Validate the input
                while (true) {
                    System.out.printf("Enter the element at (%d, %d): ", i, j);
                    int elem = input.nextInt();
                    if (elem < 0 || elem > 99) {
                        System.out.println("Error: Element should be a two-digit integer.");
                    } else {
                        arr[i][j] = elem;
                        break;
                    }
                }
            }
        }
        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        // Print the modified array
        System.out.println("Modified array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int elem = arr[i][j];
                if (elem % 2 == 1) {
                    elem *= 2;
                } else {
                    continue;
                }
                System.out.printf("%2d ", elem);
            }
            System.out.println();
        }
    }
}