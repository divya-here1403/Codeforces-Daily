import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            StringTokenizer st = new StringTokenizer(br.readLine());

            // We don't actually need the permutation values.
            for (int i = 0; i < n; i++) {
                st.nextToken();
            }

            if (n == 1) {
                System.out.println(1);
            } else {
                for (int i = 0; i < n; i++) {
                    if (i > 0) {
                        System.out.print(" ");
                    }
                    System.out.print(2);
                }
                System.out.println();
            }
        }
    }
}