import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if ((sum & 1) == 1 || ((long) n * k) % 2 == 0) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}