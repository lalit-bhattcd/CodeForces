import java.util.*;
public class Lucky{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String NumStr = sc.nextLine();

            int[] array = new int[6];
            for (int i = 0; i < 6; i++) {
                array[i] = Character.getNumericValue(NumStr.charAt(i));
            }
            for(int k = 0; k < 3 ; k++){
                num1 += array[k];
            }
            for(int m = 3 ; m < 6 ; m++){
                    num2 += array[m];
            }
        if(num1 == num2){
            System.out.println("YES");
            num1 = 0;
            num2 = 0;
        }
        else{
            System.out.println("NO");
            num1 = 0;
            num2 = 0;
        }
    }
}
}