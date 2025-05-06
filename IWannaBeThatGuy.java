import java.util.*;
public class IWannaBeThatGuy{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> Holder = new HashSet<>();
        int n = sc.nextInt();
        int p = sc.nextInt();
        for(int i = 0 ; i < p; i++){
            Holder.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i = 0 ; i < q; i++){
            Holder.add(sc.nextInt());
        }
        if(Holder.size() == n) {
            System.out.println("I become the guy.");
        }
        else{
        System.out.println( "Oh, my keyboard!");
        }
    }
}