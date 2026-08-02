import java.io.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len == -1) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ');

            int num = 0;
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }
            return num;
        }
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = fs.nextInt();
            }

            int start = 0;

            while (start < n && p[start] == n - start) {
                start++;
            }

            if (start < n) {
                int pos = start;
                for (int i = start; i < n; i++) {
                    if (p[i] > p[pos]) {
                        pos = i;
                    }
                }
                reverse(p, start, pos);
            }

            for (int x : p) {
                out.append(x).append(' ');
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}