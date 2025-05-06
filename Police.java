import java.util.*;
public class Police{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int HiredPolice = 0;
        int crime = 0;
        int n = sc.nextInt();

        int[] CrimeReport = new int[n];
        for(int i = 0 ; i < n ; i++){
            CrimeReport[i] = sc.nextInt();  
            if(CrimeReport[i] > 0){
                HiredPolice+=CrimeReport[i];
            }
            else if(HiredPolice > 0){
                HiredPolice--;
            }
            else{
             crime++;
            }
        }
        System.out.println(crime);
    }
}