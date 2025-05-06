import java.util.*;
public class creatingWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i > t){
            String Words = sc.nextLine();
            char NewWord = Words.charAt(0);
            Words.charAt(4) = NewWord;
            char NewWord =  Words.charAt(4); 
            Words.charAt(0) = Words.charAt(4); 
            System.out.println(Words);
            i++;
            sc.close();
    }
}
}