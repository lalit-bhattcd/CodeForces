import java.util.*;
public class PetyaAndString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        int result =  str1.compareTo(str2);
        if(result==0){
            System.out.println("0");
        }
        else if(result < 0){
            System.out.println("-1");
        }
        else{
            System.out.print("1");
        }
    }
}