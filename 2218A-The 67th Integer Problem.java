// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int t = Integer.parseInt(br.readLine());

//         while (t-- > 0) {
//             int x = Integer.parseInt(br.readLine());
//             System.out.println(x);
//         }
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();

            if (x < 67)
                System.out.println(x + 1);
            else
                System.out.println(67);
        }

        sc.close();
    }
}