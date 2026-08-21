
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int W = sc.nextInt();

        int max = Math.max(Y, W);

        int favorable = 6 - max + 1;
        int total = 6;

        int gcd = findGCD(favorable, total);

        favorable /= gcd;
        total /= gcd;

        System.out.println(favorable + "/" + total);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

