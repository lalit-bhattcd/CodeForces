import java.util.Scanner;
public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int length = n/2;
            int[] arr = new int[n];

            if(length%2 == 0){
                int sumEven = 0;
                for (int i = 0; i < length; i++) {
                    arr[i] = 2 * (i + 1);         
                    sumEven += arr[i];
                }

                int sumOdd = 0;
                for (int i = 0; i < length-1; i++) {
                    arr[length + i] = 2 * i + 1;   
                    sumOdd += arr[length + i];
                }

                arr[n - 1] = sumEven - sumOdd;  
                
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                  System.out.print(arr[i] + " ");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
