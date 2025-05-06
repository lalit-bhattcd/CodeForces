import java.util.Scanner;
public class WayToLong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of words
        sc.nextLine(); //consumes the newline char after nextint!! 
        while(n > 0){
            String word;
            word = sc.nextLine(); 
        if(word.length() > 10){
            int length = word.length();//introduction 1 > length > 12 || 
            int adjustedLength = length - 2; // 2 > 12 - 2 = 10 || adjustedlength = 10
            System.out.println(word.charAt(0) +"" + adjustedLength + word.charAt(length-1)); // 1 > i || 2 > 10 || 3 > n || output = i10n
        }
        else{
            System.out.println(word);
        }
        n--;
    }
}
}