import java.util.*;
public class WrongSubstraction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();
        int newNumber = number;
        for(int i = 0 ; i < k ; i++){
            if(newNumber%10 == 0){
                newNumber = newNumber/10;
            } 
            else{
                newNumber--;
            }
        }
        System.out.println(newNumber);
        sc.close();
    }
}