import java.util.*;
public class StonesOnTheTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String Table = sc.nextLine();
        int count = 0;
        char hold = Table.charAt(0);
        for(int i = 1 ; i < n; i++){
            if(hold == Table.charAt(i)){
                count++;
            }
           hold = Table.charAt(i);
        }
        System.out.println(count);
        sc.close();
    }
}