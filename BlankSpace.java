import java.util.*;
public class BlankSpace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalZeros = 0;
        int hold = 0;
        while(n-- > 0){
        int t = sc.nextInt();
        int arr[] = new int[t];
        for(int i = 0 ; i < t ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                totalZeros++;
                if(totalZeros > hold){
                     hold++;
            }
        }
        else{
                totalZeros = 0;
        }
}
        System.out.println(hold);
        hold = 0;
        totalZeros = 0;
    }   
}
}