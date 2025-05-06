import java.util.Scanner;
public class NumOfCandies{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int numOfCounts = 0;
        for(int i = 0 ; i < t ; i++){
            int candies = sc.nextInt();
            numOfCounts = (candies - 1) / 2;
            System.out.println(numOfCounts);
        }
        sc.close();
    }
}