import java.util.*;
public class PoliceRecruit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int HiredPolice = 0;
        int crime = 0;
        int n = sc.nextInt();

        int[] CrimeReport = new int[n];
        for(int i = 0 ; i < n ; i++){
            CrimeReport[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){   
            while(CrimeReport[i] > 0 || HiredPolice > 0){
                if(CrimeReport[i] > 0){
                    HiredPolice += CrimeReport[i];
                }
                else{
                    HiredPolice--;
                }
             }
             crime++;
        }
        System.out.println(crime);
    }
}