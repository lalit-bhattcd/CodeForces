import java.util.Scanner;
public class minimaiSquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int opt1 = Math.max(2*a, b);
            int opt2 = Math.max(2*b, a);

            int output = Math.min(opt1,opt2);
            System.out.println(output*output);
        }
        sc.close();
    }
}