import java.util.*;
public class a+bAgain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int num = 0
            String input = sc.nextInt();
            for(int i = 0 ; i < 2 ; i++){
                num += Integer.parseInt(input.charAt(i));
            }
            System.out.println(num);
        }
    }
}