import java.util.*;
public class TomyCritics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] arr = new int[3];
            for(int i = 0 ; i < 3 ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[1] + arr[2] >= 10){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    }
}