import java.util.*;
public class WrongSubstraction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        int Times = sc.nextInt();
        String numStr = String.valueOf(number);
        int length = numStr.length() - 1;
        char hold = numStr.charAt(length);
        long newNumber = number;
        for(int i = 0 ; i < Times ; i++){
            if(hold == '0'){
                newNumber = number / 10;
                numStr = String.valueOf(newNumber);
                length = numStr.length() - 1;
                hold = numStr.charAt(length);
            }
            else{
                newNumber--;
                numStr = String.valueOf(newNumber);
                length = numStr.length() - 1;
                hold = numStr.charAt(length);
            }
        }
        System.out.println(newNumber);
        sc.close();
    }
}