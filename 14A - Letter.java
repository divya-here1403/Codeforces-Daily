import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] grid = new char[n][m];

        int minRow = n, maxRow = -1;
        int minCol = m, maxCol = -1;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            grid[i] = s.toCharArray();

            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '*') {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        // Print only the required rectangle
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}