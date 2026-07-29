import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            System.out.print(2 * n);

            for (int i = 1; i < n; i++) {
                System.out.print(" " + i);
            }

            System.out.println();
        }

        sc.close();
    }
}
