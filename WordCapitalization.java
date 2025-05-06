import java.util.*;
public class WordCapitalization{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = 0;
        char uppercase = Character.toUpperCase(word.charAt(0));
        String subString = word.substring(1);
        System.out.println(uppercase + subString);
    }
}