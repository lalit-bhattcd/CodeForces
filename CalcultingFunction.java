import java.util.Scanner;
public class CalcultingFunction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 0;
        for(long i = 1 ; i <= n ; i++){
            if(i % 2 == 0){
                result =  result + i;
            }
            else{
                result = result - i;
            }
        }
        System.out.println(result);
    }
}