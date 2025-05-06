
import java.util.Scanner;
public class NewYearAndHurry{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int TotalQuestion = 0;
        int TotalTime = t;
        int i = 1;
        while(i <= n){
            int TimeforProb = i * 5;
            if(TotalTime + TimeforProb <= 240){
                TotalQuestion++;
                TotalTime += TimeforProb;
                i++;
            }
            else{
                break;
            }
        }
        System.out.println(TotalQuestion);
        sc.close();
    }
}