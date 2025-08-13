import java.util.*;


public class Quintomania{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-- > 0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i+1] == arr[i]+5 || arr[i+1] == arr[i] + 7 || arr[i+1] == arr[i]- 5 || arr[i+1] == arr[i] - 7){
                total++;
            }
        }
        if(total == n-1){
            System.out.println("YES");
        }
        else{System.out.println("NO");}
    }
    }
}