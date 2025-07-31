import java.util.*;
public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int totalCalories = 0;
        for(int i = 0 ; i < 4 ; i++){
            arr[i] = sc.nextInt();
        }

        String s = sc.next();

        for(int i = 0 ; i < s.length(); i++){
            int hold = Character.getNumericValue(s.charAt(i));
            totalCalories += arr[hold-1];
        }
        System.out.println(totalCalories);
    }
}
