import java.util.Arrays;
import java.util.Scanner;
public class FairDivision{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            int onesCount = 0;
            int twoCount = 0;
            
            int sum = 0;
            for(int i = 0; i < n ; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
                if(arr[i] == 1){
                    onesCount++;
                }
                else{
                    twoCount++;
                }
            }
            if(sum % 2 != 0 ){
                System.out.println("NO");
            }
            else if(onesCount == 0 && twoCount %2 !=0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
