import java.util.Scanner;
public class NumOfcandies{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int candies = sc.nextInt();
        int numOfCounts = (candies - 1) / 2;
        }
        System.out.println(numOfCounts);
        sc.close();
    }
}