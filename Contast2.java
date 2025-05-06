import java.util.Scanner;

public class Contast2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < t; j++) {
            String str = sc.nextLine();
            int length = str.length();
            boolean found;

            while (length > 1) {
                StringBuilder hold = new StringBuilder();
                found = false;

                for (int i = 0; i < str.length(); i++) {
                    if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                        i++;
                        found = true;
                    } else {
                        hold.append(str.charAt(i));
                    }
                }

                if (!found) break;

                str = hold.toString();
                length = str.length();
            }

            result.append(Math.max(length, 1)).append("\n");
        }

        System.out.print(result);
        sc.close();
    }
}
