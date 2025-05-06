import java.util.Scanner;
public class AnotherTwoIntProb{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       

        for(int i = 0 ; i < t ; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
1
        int numOfSteps = 0;

        while(a != b){
            if(a < b){
                int num1 = b - a;
                int temp = num1 % 10;
                if(num1 % 10 != 0){
                    num1 = num1 - temp;
                    a = a+temp;
                    numOfSteps++;
                }
                else{
                    numOfSteps += num1 / 10;
                    a = b;
                }
            }
            else{
                int num1 = a - b;
                int temp = num1 % 10;
                if(num1 % 10 != 0){
                    num1 = num1 - temp;
                    a = a-temp;
                    numOfSteps++;
                }
                else{
                    numOfSteps += num1 / 10;
                    a = b;
                }
            }
        }
        System.out.println(numOfSteps);
    }
}
}