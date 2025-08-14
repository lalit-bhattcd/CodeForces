import java.util.*;

public class MostSimilerWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }

            int minDiff = Integer.MAX_VALUE;

            // Compare every pair
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int diff = 0;
                    for (int k = 0; k < m; k++) {
                        diff += Math.abs(words[i].charAt(k) - words[j].charAt(k));
                    }
                    minDiff = Math.min(minDiff, diff);
                }
            }

            System.out.println(minDiff);
        }

        sc.close();
    }
}
