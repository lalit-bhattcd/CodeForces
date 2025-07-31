import java.util.*;
public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int length = sc.nextInt();
            int[] arr = new int[length];

        int evenMis = 0;
        int oddMis = 0;

            for(int i = 0 ; i < length; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i < length ; i++){
                if(arr[i] %2 != i % 2){
                    if(arr[i] % 2 == 0){ evenMis++;} 
                    else {oddMis++;} 
                }
            }
            if(evenMis == oddMis){
                System.out.println(evenMis);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
