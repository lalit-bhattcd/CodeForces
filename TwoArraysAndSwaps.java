import java.util.*;

public class MaximizeArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();  
            int k = sc.nextInt(); 
            int[] A = new int[n];
            int[] B = new int[n];

            for (int i = 0; i < n; i++) A[i] = sc.nextInt();
            for (int i = 0; i < n; i++) B[i] = sc.nextInt();

            Arrays.sort(A); 
            Arrays.sort(B); 
           
            for (int i = 0; i < k; i++) {
                int aVal = A[i];
                int bVal = B[n - 1 - i];

                if (aVal < bVal) {
                    A[i] = bVal;
                } else {
                    break; 
                }
            }

            int sum = 0;
            for (int num : A) sum += num;
            System.out.println(sum);
        }
    }
}
