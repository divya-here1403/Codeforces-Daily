import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                int greater = 0;
                int smaller = 0;

                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i]) {
                        greater++;
                    } else if (a[j] < a[i]) {
                        smaller++;
                    }
                }

                out.append(Math.max(greater, smaller));
                if (i + 1 < n) out.append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}