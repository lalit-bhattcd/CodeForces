import java.util.*;
public class BoyorGirl{
    public static void main(String args[]){
        int Number = 0;
        Scanner sc = new Scanner(System.in);
        HashSet<Character> Check = new HashSet<>();
        String UserName = sc.nextLine();
       // int Length = UserName.length() + 1;// used to add length on a string
        for(int i = 0 ; i < UserName.length() ; i++){
           // String NewWord;
            if(Check.contains(UserName.charAt(i))){
                        continue;
            } 
            else{
                    Check.add(UserName.charAt(i));
                    Number++;
            }
        }
        if(Number % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}