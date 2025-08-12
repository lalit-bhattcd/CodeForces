import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> letters = new ArrayList<>(Arrays.asList( 'a', 'o', 'y', 'e', 'u', 'i'));


        String s = sc.next().toLowerCase();

        System.out.println(s);
        String outputString = "";
        for(int i = 0; i < s.length() ; i++){
            if(letters.contains(s.charAt(i))){
                outputString += "";
            }
            else{
                outputString += '.';
                outputString += String.valueOf(s.charAt(i)).toLowerCase();
            }
        }
        System.out.println(outputString);
    }
}
