import java.util.*;

public class Main {

    static String removeChar(String s, int idx) {
        return s.substring(0, idx) + s.substring(idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            String bestForAlice = null;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') continue;

                String afterAlice = removeChar(s, i);

                String bestForBob = null;

                for (int j = 0; j < afterAlice.length(); j++) {
                    if (afterAlice.charAt(j) != '1') continue;

                    String finalStr = removeChar(afterAlice, j);

                    if (bestForBob == null || finalStr.compareTo(bestForBob) < 0) {
                        bestForBob = finalStr;
                    }
                }

                if (bestForAlice == null || bestForBob.compareTo(bestForAlice) > 0) {
                    bestForAlice = bestForBob;
                }
            }

            System.out.println(bestForAlice);
        }

        sc.close();
    }
}