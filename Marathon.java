import java.util.*;
public class Marathon{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int position;
        while(t-- > 0){
            int[] arr = new int[4];
            position = 0;
            for(int i = 0 ; i < 4 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 1 ; j < 4 ; j++){
            if(arr[0] < arr[j]){
                position++;
            }
        }
        System.out.println(position);
    }
 }
}