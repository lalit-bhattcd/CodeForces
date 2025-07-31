import java.util.*;
public class IPSCBallon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int n = sc.nextInt();
        while (t-- > 0) {
            int ballonCount = 0;
        for(int i = 0 ; i < n; i++){
            char check = sc.next();
            char uppercase = Character.toUpperCase(check);
            ArrayList<Character> charList = new ArrayList<>();
            if(charList.contains(check(i))){
               ballonCount++;
               charList.add(check(i));    
            }
            else{
                ballonCount += 2;
                charList.add(check(i));
            }
        }
        System.out.println(ballonCount);
    }
}
}
