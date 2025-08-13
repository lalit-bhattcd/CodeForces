import java.util.Scanner;
public class DubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String str = s.replace("WUB", " ");
        System.out.println(str);
    }
}
