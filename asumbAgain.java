import java.util.*;
public class asumbAgain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int num = 0;
            String input = sc.next();
            for(int i = 0 ; i < 2 ; i++){
                char temp = input.charAt(i);
                num += temp - '0';
            }
            System.out.println(num);
        }
    }
}