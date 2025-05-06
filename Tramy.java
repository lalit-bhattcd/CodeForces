import java.util.*;

public class Tramy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // NUMBER OF STOPS
        int capacity = 0;     // To store the maximum number of passengers
        int hold = 0;         // To track the current number of passengers on the tram
        
        for (int i = 0; i < n; i++) {
            int enter = sc.nextInt(); // Passengers entering
            int exit = sc.nextInt();  // Passengers exiting
            hold = hold - exit + enter; // Update the number of passengers
            capacity = Math.max(capacity, hold); // Track the maximum capacity
        }

        System.out.println(capacity); // Output the result
    }
}
