import java.util.Scanner;
public class abAgain{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    
    while(t-- > 0){

        String input = sc.next();
            int one = Character.getNumericValue(input.charAt(0));
            int two = Character.getNumericValue(input.charAt(input.length()-1));
            System.out.println(one+two);
        }
}
}