import java.util.Scanner;
import java.util.Arrays;
public class RemoveSmallest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
  
        while(t-- > 0){
            int length = sc.nextInt();
            int[] arr = new int[length];
            for(int i = 0 ; i < length; i++){
                arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < length-1 ; i++){
            for(int j = 1; j < length;j++){
                if(arr[j] - arr[i] >= 1){
                    
                }
            }
        }
    }
    }
}