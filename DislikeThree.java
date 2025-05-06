import java.util.Scanner;
public class DislikeThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int num = sc.nextInt();
            if(num % 3 == 0 ||(num-3) % 10 == 0){
                continue;
            }
            System.out.println(num);
        }
    }
}