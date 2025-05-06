import java.util.*;
public class SoftDrink{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        
        int TotalMlDrink = (k * l)/nl;
        int TotalSlices =  c * d;
        p =  p / np;

        int MinVal = Arrays.stream(new int[]{TotalMlDrink, TotalSlices , p}).min().getAsInt();
        int Totaltoast = MinVal / n;
        System.out.println(Totaltoast);
    }
}
