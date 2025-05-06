import java.util.Scanner;
public class NextRound{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int knum = 0;
        for(int i = 1; i <= n ; i++){
           int Score = sc.nextInt();
           
        if(i == k){
            knum = Score;
        }
        if(Score > 0 && Score >= knum){
            x = x + 1;
        }
        }
        System.out.println(x);
}
}
