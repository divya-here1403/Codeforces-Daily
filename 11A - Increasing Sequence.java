import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long d = sc.nextLong();

        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long moves = 0;

        for (int i = 1; i < n; i++) {
            if (b[i] <= b[i - 1]) {
                long diff = b[i - 1] - b[i] + 1;

                long add = (diff + d - 1) / d;

                b[i] += add * d;
                moves += add;
            }
        }

        System.out.println(moves);
    }
}