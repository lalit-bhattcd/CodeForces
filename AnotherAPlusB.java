import java.util.Scanner;

public class AnotherAPlusB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String expr = sc.next();
            for(int i = 0 ; i < expr.length() ; i++){
                while (i != '+') {
                    int num1 += Character.getNumericValue(expr.charAt(i));
                    System.out.println(num1);
                }
            }
        }
    }
    
}
