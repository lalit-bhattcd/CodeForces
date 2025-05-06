import java.util.Scanner;

public class MaxScorePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int t = sc.nextInt();

        // Process each test case
        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int[] a = new int[n];

            // Read the array
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Frequency array (size n+1 because 1 ≤ ai ≤ n)
            int[] freq = new int[n + 1];
            for (int num : a) {
                freq[num]++;
            }

            // Calculate the maximum score
            int score = 0;
            for (int count : freq) {
                score += count / 2; // Each pair adds 1 to the score
            }

            // Print the result for this test case
            System.out.println(score);
        }

        sc.close();
    }
}