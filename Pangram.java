import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine();  
        String s = sc.nextLine().toLowerCase();
      
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s.contains(String.valueOf(ch))) { 
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES"); 
        sc.close();
    }
}
