import java.util.*;
public class Word{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();
        int UpperCase = 0;
        int LowerCase = 0;
        for(int i = 0; i < Word.length(); i++){
                char Hold = Word.charAt(i);
                char upper = Character.toUpperCase(Hold);
                if(Hold == upper ){
                    UpperCase++;
                }
                else{
                    LowerCase++;
                }
            }
                if(UpperCase <= LowerCase){
                    System.out.println(Word.toLowerCase());
                }
                else{
                    System.out.println(Word.toUpperCase());
                }
                sc.close();
        }
}