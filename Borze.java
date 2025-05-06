import java.util.Scanner;

public class Borze{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String borzeCode = scanner.next(); // Read input
        scanner.close();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < borzeCode.length(); i++) {
            if (borzeCode.charAt(i) == '.') {
                result.append("0");
            } else if (borzeCode.charAt(i) == '-') {
                if (i + 1 < borzeCode.length() && borzeCode.charAt(i + 1) == '.') {
                    result.append("1");
                    i++; 
                } else {
                    result.append("2");
                    i++; 
                }
            }
        }
        
        System.out.println(result.toString()); // Print the decoded ternary number
    }
}
