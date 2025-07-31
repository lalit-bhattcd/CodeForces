import java.util.Scanner;
import java.util.Arrays;

public class PlusOneToTheSubset{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int TotOperation = 0;
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] input = new int[size];
            for(int i = 0 ; i < size; i++){
                input[i] = sc.nextInt();
            } 
            Arrays.sort(input);
            TotOperation = input[size-1] - input[0]; 
            System.out.println(TotOperation);
        }
    }
}