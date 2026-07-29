import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(a);

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != a[n - 1 - i]) {
                    cnt++;
                }
            }

            System.out.println(cnt / 2);
        }
    }
}