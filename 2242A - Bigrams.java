import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            boolean possible = false;
            int countTwo = 0;

            for (int i = 0; i < k; i++) {
                int c = sc.nextInt();

                if (c > 2) {
                    possible = true;
                }

                if (c == 2) {
                    countTwo++;
                }
            }

            if (countTwo >= 2) {
                possible = true;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}