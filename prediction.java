import java.util.Scanner;
public class prediction{
     static int isPrime( int fir , int sec){
        fir++;
        for(int j = 2 ; j < fir ; j++){
            if(fir%j == 0){
                fir++;
                j = 2;
                }
            }
            if(fir == sec ){
                System.out.println("YES");
                return 0;
            }
            else{
                System.out.println("NO");
                return 0;
            }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    isPrime( x ,y);
    sc.close();
    }
}