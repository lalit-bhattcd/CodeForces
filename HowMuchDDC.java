import java.util.ArrayList;
import java.util.Scanner;
public class HowMuchDDC {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> input= new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                input.add(sc.nextInt());
            }
            if(input.contains(k)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
