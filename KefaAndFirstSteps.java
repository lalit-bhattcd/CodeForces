import java.util.*;
public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];

        for(int i = 0; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        int output = 1;
        int currLen = 1;
        for(int i = 0 ; i < len-1; i++){
            if(arr[i] <= arr[i+1]){
                currLen++;
                output = Math.max(output, currLen);
            }
        else {
            currLen = 1; 
    }
        }
          System.out.println(output);
    }
}
