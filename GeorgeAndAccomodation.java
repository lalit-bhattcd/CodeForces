import java.util.*;
public class GeorgeAndAccomodation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i = 0 ; i < n ; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(p < q && q - p >= 2){
                x++;
            }
        }
        System.out.println(x);
        sc.close();
    }
}