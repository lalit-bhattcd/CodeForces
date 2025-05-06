import java.util.*;
public class Elephant{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Distance = sc.nextInt();
        if(Distance % 5 != 0){
        if(Distance > 9){
            int result = Distance/5;
            int newHold = result;
            int newResult = result/result;
            int Steps = newHold + newResult;
            System.out.println(Steps);
        }
        else if(Distance > 5 && Distance <= 9){
            int result = Distance/5;
            int Steps = result + 1;
            System.out.println(Steps);
        }
        else{
            int result = Distance/Distance;
            System.out.println(result);
        }
    }
    else{
        System.out.println(Distance/5);
    }
        sc.close();
    }
}