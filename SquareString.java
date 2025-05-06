import java.util.*;
public class SquareString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String input = sc.nextLine();
            int length = input.length();
            sc.close();
            if(length % 2 != 0){
                System.out.println("NO");
            }
            else{
                String first = input.substring(0,length/2);
                String second = input.substring(length/2);
                System.out.println((first.equals(second)) ? "YES" : "NO");
                }
        }
    }    
}