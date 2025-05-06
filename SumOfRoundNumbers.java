import java.util.Scanner;
import java.util.ArrayList;

public class SumOfRoundNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            int multiplier = 1;
            ArrayList<Integer> store = new ArrayList<>();

            while (n > 0) {
                int num = n % 10; 
                int newNum = num * multiplier; 
                
                if (newNum != 0) {
                    store.add(newNum); 
                }

                n = n / 10;
                multiplier *= 10; 
            }       
            System.out.println(store.size());
            for (int val : store) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
