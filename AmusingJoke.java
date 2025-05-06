import java.util.*;
public class AmusingJoke{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String scrambled = sc.nextLine();
        sc.close();
        String merged = str1 + str2;
        if (scrambled.length() != merged.length()){
            System.out.println("NO");
            return;
        }
        char[] mergedArr = merged.toCharArray();
        char[] scrambledArr = scrambled.toCharArray();
        Arrays.sort(mergedArr);
        Arrays.sort(scrambledArr);

        if(Arrays.equals(mergedArr , scrambledArr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}