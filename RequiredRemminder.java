import java.util.Scanner;
public class RequiredRemminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        int k = (n - y) / x * x + y;
        System.out.println(k);
        }
        sc.close();
    }
}
