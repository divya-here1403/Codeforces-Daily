import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') ;
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            int[] pos = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                int x = fs.nextInt();
                pos[x] = i;
            }

            int[] pref = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1];
                if (pos[i] < i) pref[i]++;
            }

            int ans = n - pref[n];

            for (int i = 1; i <= n; i++) {
                if (pos[i] < i) {
                    ans = Math.max(ans, i - pref[i]);
                }
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
