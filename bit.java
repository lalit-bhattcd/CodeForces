import java.util.Scanner;
public class bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Enter the variable
        sc.nextLine();
        int x = 0 ;
        for(int i = 0 ; i < n ; i++){
            String operation = sc.nextLine();
        if(operation.equals("x++") || operation.equals("++x")){
            x = x + 1;
        }
        else if (operation.equals("x--") || operation.equals("--x")){
            x = x - 1;
        }
    }
    System.out.println(x);     
    }
}