import java.util.Scanner;
import java.util.ArrayList;
public class DivisibilityProblem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> collact = new ArrayList<>();
        int result = 0;
        for(int i = 0 ; i < t ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
        while(a % b != 0){
            a++;
            result++;
        }
       collact.add(result);
       result = 0;
    }
    for(int res : collact){
        System.out.println(res);
    }
    sc.close();
    }
}