import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long maxEven = 0;
            long minOdd = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                long w = sc.nextLong();

                if (i % 2 == 0) {
                    maxEven = Math.max(maxEven, w);
                } else {
                    minOdd = Math.min(minOdd, w);
                }
            }

            if (n % 2 == 0 && maxEven + 2 <= minOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}