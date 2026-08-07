
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    int x = Integer.parseInt(st.nextToken());
                    freq.put(x, freq.getOrDefault(x, 0) + 1);
                }
            }

            boolean ok = true;
            int limit = n * (n - 1);

            for (int cnt : freq.values()) {
                if (cnt > limit) {
                    ok = false;
                    break;
                }
            }

            out.append(ok ? "YES" : "NO").append('\n');
        }

        System.out.print(out);
    }
}