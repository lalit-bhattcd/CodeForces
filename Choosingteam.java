import java.util.*;
public class Choosingteam {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int canParticipate = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0 ; i < n; i++){
            input[i] = sc.nextInt();
            if(input[i] + k <= 5){
                canParticipate++;
            }
        }
        System.out.println(canParticipate/3);
        sc.close();
    }
}
