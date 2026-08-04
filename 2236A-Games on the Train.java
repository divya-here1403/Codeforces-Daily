import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int minHeight = Integer.MAX_VALUE;
            int maxHeight = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                if (h < minHeight) {
                    minHeight = h;
                }
                if (h > maxHeight) {
                    maxHeight = h;
                }
            }

            System.out.println(maxHeight - minHeight + 1);
        }

        sc.close();
    }
}