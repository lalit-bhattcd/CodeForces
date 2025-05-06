import java.util.Scanner;
public class BuyShovel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int i = 1;
        int BuyShovel = 0;

        int reminder = k % 10;
        while(reminder != 0 && reminder != r){
            int newNum = k*i;
            reminder = newNum % 10;
            i++;
            BuyShovel++;
        }
        if(BuyShovel != 0){
        System.out.println(BuyShovel);
    }
        else{
       // BuyShovel++;
        System.out.println(i);
    }
 }
}