import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int maxScore = 100 * n;

            boolean[] dp = new boolean[maxScore + 1];
            dp[0] = true;

            for (int i = 0; i < n; i++) {
                int step = 100 / a[i];

                boolean[] next = new boolean[maxScore + 1];

                // Problem i can contribute:
                // 0, step, 2*step, ..., a[i]*step = 100
                for (int score = 0; score <= maxScore; score++) {
                    if (!dp[score]) continue;

                    for (int x = 0; x <= a[i]; x++) {
                        int newScore = score + x * step;

                        if (newScore <= maxScore) {
                            next[newScore] = true;
                        }
                    }
                }

                dp = next;
            }

            boolean possible = true;

            for (int score = 0; score <= maxScore; score++) {
                if (!dp[score]) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "Yes" : "No");
        }
    }
}