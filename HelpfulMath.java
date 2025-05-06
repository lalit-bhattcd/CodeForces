import java.util.*;
public class HelpfulMath{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String[] numbers = num1.split("\\+");
        Arrays.sort(numbers);
        String result = String.join("+" , numbers);
        System.out.println(result);
    }
}