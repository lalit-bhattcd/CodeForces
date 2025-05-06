import java.util.*;
public class maxScore{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//t : number of test cases
        while(t-- > 0){
            int n = sc.nextInt();//n: the size of an array
            int[] a = new int[n]; // an array names a

        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
         int[] freq = new int[n + 1];
            for (int num : a) {
                freq[num]++;
        }
        int score = 0;
        for (int count : freq) {
             score += count / 2; 
        }
        
         System.out.println(score);
    }
                    sc.close();
    }
}