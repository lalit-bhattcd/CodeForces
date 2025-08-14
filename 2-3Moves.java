import java.util.*;
public class 2-3Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 3 == 0){
                System.out.println(n/3);
                return;
            }
            
            if(n % 2 ==0){
                System.out.println(n/2);
                return;
            }
            int x = 0;
            while(x != n){
            if(n % 2 !=0){
                x += 3;
            }
            else{
                x+=2;
            }
        }
        }
    }
}