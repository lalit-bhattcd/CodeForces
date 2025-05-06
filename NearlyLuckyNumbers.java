import java.util.*;
public class NearlyLuckyNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
       // int hold = String.valueOf(x).length();
        int variable = 0;
        while(x != 0){
           if(x%10 == 4 || x % 10 == 7){
                variable++;
            }  
            x = x / 10;
        }
          if(variable == 4 || variable == 7){
                  System.out.println("YES");
               }
               else{
                    System.out.println("NO");
               }
           }
}