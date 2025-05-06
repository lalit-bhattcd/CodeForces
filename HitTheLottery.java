import java.util.Scanner;
public class HitTheLottery{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Lottery = sc.nextInt();
        int[] bills = {100 , 20 , 10 , 5 , 1};
        int numOfBills = 0;
        int sumOfBills = 0;
        int i = 0;
        while(Lottery != 0){
            while(bills[i] <= Lottery){
                Lottery = Lottery - bills[i];
                numOfBills++;
                }
                i++;
            }
            System.out.println(numOfBills);
        }
}