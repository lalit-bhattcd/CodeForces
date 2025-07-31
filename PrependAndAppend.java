import java.util.Scanner;
public class PrependAndAppend{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int i = 0;
            int j = n-1;    
        
            int check = 0;
            while(i < j && s.charAt(i) != s.charAt(j)){
                check+=2;
                i++;
                j--;
            }
            int length = n-check;
            System.out.println(length);
        }
    }
}