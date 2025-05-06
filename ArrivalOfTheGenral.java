import java.util.*;
public class ArrivalOfTheGenral{
    public static int swap(int n , int[] squad){
        int numOfSwap = 0;
        int largest = squad[0];
        int largestIndex = 0;
        for(int i = 1 ; i < n ; i++){
            if(largest < squad[i]){
                largest = squad[i];
                largestIndex = i;
            }
        }
        numOfSwap += largestIndex;
        int smallest = squad[n-1];
        int smallestIndex = n-1;
         for(int i = n-1 ; i >= 0 ; i--){
            if(smallest > squad[i]){
                smallest = squad[i];
                smallestIndex = i;
            }
        }
        if (smallestIndex < largestIndex) {
            numOfSwap--;  
        }
        numOfSwap += (n - 1 - smallestIndex);
        return numOfSwap;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] squad = new int[n];
        for(int i = 0; i < n ; i++ ){
            squad[i] = sc.nextInt();
        }
        sc.close();
        int result = swap(n , squad);
        System.out.println(result);
    }
}