import java.util.Scanner;
public class ColorBlindness {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int length = sc.nextInt();

            String One = sc.next();

            String two = sc.next();
        
            int OneCount = 0;
            int twoCount = 0;
            for(int i = 0 ; i < length; i++){
                if(One.charAt(i)=='R'){
                    OneCount++;
                }

                if(two.charAt(i) == 'R'){
                    twoCount++;
                }
            }
            if(OneCount == twoCount){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
