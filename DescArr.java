import java.util.Scanner;
import java.util.Arrays;
public class DescArr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(n % 2 != 0){
        int m = n/2;
        int middlElement = arr[m];
        int i = 0;
        int j = n-1;
        while(middlElement != arr[i])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }   
    else if(n % 2 == 0){
        int NumOfSwap = 0;
        int TotalSwap = n / 2;
        int i = 0;
        int j = n-1;
        while(TotalSwap > NumOfSwap){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
            NumOfSwap++;
        }
    }
    for(int i = 0 ; i < n ; i++){
    System.out.println(arr[i]);
    }
}
}