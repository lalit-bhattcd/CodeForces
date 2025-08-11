import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char c = sc.next().charAt(0);
            boolean possible = false;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c && i % 2 == 0) { // 0-based even index means odd position
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
