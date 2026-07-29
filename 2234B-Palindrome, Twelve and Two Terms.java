import java.util.*;

public class Main {

    static boolean isPalindrome(long x) {
        String s = Long.toString(x);
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            boolean found = false;

            for (long b = 0; b <= n; b += 12) {
                long a = n - b;

                if (isPalindrome(a)) {
                    System.out.println(a + " " + b);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}