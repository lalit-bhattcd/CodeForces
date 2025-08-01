import java.util.*;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int[] s = new int[4];
            for (int i = 0; i < 4; i++) {
                s[i] = sc.nextInt();
            }

            // winners of first-round matches
            int winner1 = Math.max(s[0], s[1]);
            int winner2 = Math.max(s[2], s[3]);

            // find top 2 strengths overall
            Arrays.sort(s);
            int top1 = s[3];
            int top2 = s[2];

            if ((winner1 == top1 && winner2 == top2) || (winner1 == top2 && winner2 == top1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
