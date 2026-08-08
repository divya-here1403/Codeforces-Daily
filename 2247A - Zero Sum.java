import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int minusOne = 0;

            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == -1) {
                    minusOne++;
                }
            }

            if (n % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println(minusOne % 2 == (n / 2) % 2 ? "YES" : "NO");
            }
        }

        sc.close();
    }
}