import java.util.*;
public class Incresing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                set.add(num);
            }

            if(set.size() == n){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}