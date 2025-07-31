import java.util.Arrays;
import java.util.Scanner;
public class GoodKid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int product = 1;
            int arr[] = new int[n];

            int min = 0;
            for(int i = 0 ; i < n; i++){
                arr[i] = sc.nextInt();

                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            arr[min] += 1;
            for(int i = 0 ; i < n ; i++){
                product *= arr[i];
            }
            System.out.println(product);
        }
    }
}
