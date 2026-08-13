import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[n + 1];

        // Count distinct prime divisors of every number
        for (int p = 2; p <= n; p++) {
            // If count[p] is 0, p is prime
            if (count[p] == 0) {
                for (int j = p; j <= n; j += p) {
                    count[j]++;
                }
            }
        }

        int ans = 0;

        // Numbers having exactly 2 distinct prime divisors
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}