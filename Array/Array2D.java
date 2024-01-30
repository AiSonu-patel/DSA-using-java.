import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the row values");
            int row = sc.nextInt();
            System.out.println("Enter the column values");
            int cols = sc.nextInt();
            int[][] matrix = new int[row][cols];

            // input
            // row
            System.out.println("Enter the row " + row + " and column " + cols);
            for (int i = 0; i < row; i++) {
                // columns
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter the Searching Element: ");
            int x = sc.nextInt();
            // int ans = 0;

            for(int i = 0; i < row; i++){
                for(int j = 0; j < cols; j++){
                    if(matrix[i][j] == x){
                        System.out.println("X found at location ("+i+","+j+")");
                    }
                }
            }
        }
    }
}
