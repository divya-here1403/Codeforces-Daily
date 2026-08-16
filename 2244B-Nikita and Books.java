import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            long prefixSum = 0;
            boolean possible = true;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                long x = Long.parseLong(st.nextToken());
                prefixSum += x;

                // Minimum books required in first i stacks:
                // 1 + 2 + ... + i = i * (i + 1) / 2
                long required = (long) i * (i + 1) / 2;

                if (prefixSum < required) {
                    possible = false;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}