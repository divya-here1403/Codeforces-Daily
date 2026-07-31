import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            // rightMaxIdx[i] = index of the rightmost maximum in prefix [0..i]
            int[] rightMaxIdx = new int[n];

            int maxVal = a[0];
            int idx = 0;
            rightMaxIdx[0] = 0;

            for (int i = 1; i < n; i++) {
                if (a[i] > maxVal) {
                    maxVal = a[i];
                    idx = i;
                } else if (a[i] == maxVal) {
                    idx = i; // keep the rightmost maximum
                }
                rightMaxIdx[i] = idx;
            }

            int ans = 0;
            int end = n - 1;

            while (end >= 0) {
                ans++;
                end = rightMaxIdx[end] - 1;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}