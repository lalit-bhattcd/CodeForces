import java.util.Scanner;
public class VladAndTheBestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();

            int countofA = 0;
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == 'A'){
                    countofA++;
                }
        
            }
                    if(countofA > 2){
                    System.out.println("A");
                }
                else{
                    System.out.println("B");
                }
        }
    }
}
