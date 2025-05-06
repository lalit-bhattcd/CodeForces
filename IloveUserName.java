import java.util.Scanner;
import java.util.Arrays;
public class IloveUserName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] performence = new int[n];
        int AmazingPer = 0;
        for(int i = 0 ; i < n ; i++){
            performence[i] = sc.nextInt();
        }
        int BestCase = performence[0];
        int WrostCase = performence[0];
        for(int i = 1 ; i < n ; i++){
            if(performence[i] > BestCase){
                AmazingPer++;
                BestCase = performence[i];
            }
            else if(performence[i] < WrostCase){
                AmazingPer++;
                WrostCase = performence[i];
            }
            else{
                continue;
            }
        }
        System.out.println(AmazingPer);
        sc.close();
    }
}