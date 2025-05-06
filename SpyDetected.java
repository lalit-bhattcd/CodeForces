import java.util.*;

public class SpyDetected {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();

       while(t-- > 0){
       int length = sc.nextInt();
       int arr[] = new int[length];
       for(int i  = 0 ; i < length ; i++){
        arr[i] = sc.nextInt();
       }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == 1){
                System.out.println(i+1);
            }
        }
        }   
    }   
}
