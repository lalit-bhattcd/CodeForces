import java.util.Scanner;
public class AandBSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        while (t-- > 0) {
            String input = sc.next();
            sc.nextLine();
            String PastChar = ""; 
            String afterChar = "";
            int sum = 0;
            for(int i = 0 ; i < input.length() ; i++){
                while(input.charAt(i) != '+'){
                    PastChar += String.valueOf(input.charAt(i));
                }   
                    i++;
                    afterChar += String.valueOf(input.charAt(i));
                }
            System.out.println(PastChar);
            System.out.println(afterChar);
            sum = Integer.parseInt(PastChar) + Integer.parseInt(afterChar);
            System.out.println(sum);
        }
    }
}
