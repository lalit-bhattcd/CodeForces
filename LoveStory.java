import java.util.Scanner;
public class LoveStory {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    String check = "codeforces";
    while(t-- > 0){
    int differ = 0;
    String input =  sc.nextLine();
    for(int i = 0 ; i < input.length();i++){
        if(input.charAt(i) == check.charAt(i)){
            continue;
        }
        else{
            differ++;
        }
    }
    System.out.println(differ);
}
sc.close();
}
}