import java.util.*;
public class IPSCBaloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int TotalBaloon = 0;
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Character> value = new ArrayList<>();
            String input = sc.nextLine();
            for(int i = 0 ; i < n ; i++){
                char hold = Character.toUpperCase(input.charAt(i));
                if(value.contains(hold)){
                    TotalBaloon++;
                    value.add(hold);
                }
                else{
                  TotalBaloon+=2;
                  value.add(hold);
                }
            }
            System.out.println(TotalBaloon);
        }
    }
}
