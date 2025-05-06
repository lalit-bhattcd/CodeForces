import java.util.*;
public class MishikaAndGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mishWon = 0;
        int chrisWon = 0;
        while(n-- > 0){
            int mishika = sc.nextInt();
            int chris = sc.nextInt();
            if(mishika > chris){
                mishWon++;
            }
            else if(chris > mishika){
                chrisWon++;
            }
            else{
                continue;
            }
        
        if(mishWon > chrisWon){
            System.out.println("Mishika");
        }
        else if(chrisWon > mishWon){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
    }
}