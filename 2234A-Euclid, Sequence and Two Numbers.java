import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer[] a = new Integer[n];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a, Collections.reverseOrder());

            boolean ok = true;
            for (int i = 2; i < n; i++) {
                if (a[i - 2] % a[i - 1] != a[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                ans.append(a[0]).append(" ").append(a[1]).append("\n");
            } else {
                ans.append("-1\n");
            }
        }

        System.out.print(ans);
    }
}