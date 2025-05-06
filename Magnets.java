import java.util.*;
public class Magnets{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int OldNumber = 0;
        for(int i = 0 ; i < n ; i++){
            int number = sc.nextInt();
            if(OldNumber != -1 && OldNumber != number){
                x++;
            }
            OldNumber = number;
        }
        System.out.println(x);
    }
}