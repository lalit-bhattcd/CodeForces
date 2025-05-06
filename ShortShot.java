import java.util.Scanner;
public class ShortShot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String input = sc.nextLine();

            if(input.equals("abc") || input.equals("cba")){
                System.out.println("YES");
            }
            else{
                if(input.charAt(0) == 'c' || input.charAt(2) == 'a'){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}