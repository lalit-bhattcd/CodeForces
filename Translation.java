import java.util.*;
public class Translation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next();
        String secondStr = sc.next();
        String newString = "";
        int i =  firstStr.length() - 1;
        while(i >= 0){
            newString += firstStr.charAt(i);
            i--;
        }
        if(secondStr.equals(newString)){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}