import java.util.Scanner;
public class MostNewWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int numStr = sc.nextInt(); // Number of strings
            int lenStr = sc.nextInt(); // Length of each string
            sc.nextLine(); // Consume the leftover newline

            String[] words = new String[numStr]; // Store all input strings
            for (int i = 0; i < numStr; i++) {
                words[i] = sc.nextLine();
            }

            int totalMoves = 0;
            // Compare each pair of strings in the list
            for (int i = 0; i < numStr - 1; i++) {
                String str1 = words[i];
                String str2 = words[i + 1]; // Compare with the next string
                for (int j = 0; j < lenStr; j++) {
                    totalMoves += Math.abs(str1.charAt(j) - str2.charAt(j));
                }
            }

            System.out.println(totalMoves); // Print for each test case
        }
        sc.close();
    }
}
