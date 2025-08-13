import java.util.*;
public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int arr[] = new int[len];

        int oddCount = 0;
        int evenCount = 0;

        int evenindex = 0;
        int oddindex = 0;

        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] %2 == 0){
                evenCount++;
                evenindex = i;
            }
            else{
                oddCount++;
                oddindex = i;
            }
        }
        if(evenCount < oddCount){
            System.out.println(evenindex+1);
        }
        else{
            System.out.println(oddindex+1);
        }
    }
}
