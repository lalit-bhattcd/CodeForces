import java.util.Scanner;
public class DislikeOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        int k = sc.nextInt();
        System.out.println(findKthNumber(k)); 
        }
    }

    public static int findKthNumber(int k) {
        int count = 0; 
        int num = 1;  
        
        while (true) {
          
            if (num % 3 != 0 && num % 10 != 3) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++; 
        }
    }
}