import java.util.*;
public class SoldierAndBanana{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();//The cost of the first banana
        int N = sc.nextInt();//Initial number of dollers the soldier have
        int W = sc.nextInt();//The Number of banana he wants
        int TotalCost = 0;
        for(int i = 1; i <= W ; i++){
            int FirstBanana = i * k;
            TotalCost = FirstBanana + TotalCost;
            //k++;
        }
        int borrow = TotalCost - N;
        System.out.println(borrow);
        sc.close();
    }
}