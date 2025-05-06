import java.util.Scanner;

public class Contast1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String newString = sc.nextLine();

            if (newString.endsWith("us")) {
                newString = newString.substring(0, newString.length() - 2) + "i";
            } else if (newString.endsWith("i")) {
                newString = newString.substring(0, newString.length() - 1) + "us";
            }

            result.append(newString).append("\n");
        }

        System.out.print(result.toString());
        sc.close();
    }
}
