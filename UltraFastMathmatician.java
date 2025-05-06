import java.util.*;
public class UltraFastMathmatician{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstNum = sc.next();
        String secondNum = sc.next();
        long num1 = Long.parseLong(firstNum , 2 );
        long num2 = Long.parseLong(secondNum , 2);
        long output = num1 ^ num2;
        int maxLength = Math.max(firstNum.length(), secondNum.length());
        String result = String.format("%" + maxLength + "s", Long.toBinaryString(output)).replace(' ', '0');
        System.out.println(result);
    }
}