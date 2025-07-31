import java.util.Scanner;

public class DesignTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println((n - 4) + " 4");
        } else {
            System.out.println((n - 9) + " 9"); 
        }
    }
}