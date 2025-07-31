import java.util.Scanner;

public class DieRoll {
    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static void simplifyFraction(int numerator, int denominator) {
        long g = gcd(numerator, denominator);
        long simplifiedNum = numerator / g;
        long simplifiedDen = denominator / g;
        System.out.println(simplifiedNum + "/" + simplifiedDen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int w = sc.nextInt();

        int check = (y > w) ? y : w;
        int denominator = 6;
        int numerator = denominator - check;
        numerator++;
        simplifyFraction(numerator, denominator);
    }
}