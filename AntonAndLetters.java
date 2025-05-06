import java.util.*;
public class AntonAndLetters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("{", "").replace("}", "").replace(" ", "").trim();
        if(input.isEmpty()){
            System.out.println("0");
            return;
        }
        String[] newStr = input.split(" ");
        newStr = input.split("," );
        HashSet<String> Anton = new HashSet<>(Arrays.asList(newStr));
        System.out.println(Anton.size());
    }
}