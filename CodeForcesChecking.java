import java.util.*;
public class CodeForcesChecking{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "codeforces";
        int t = sc.nextInt();

        for(int i = 0 ; i < t ; i++){
            String chr = sc.next();
            if(str.contains(chr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}