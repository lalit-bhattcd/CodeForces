import java.util.Scanner;
public class Hulk{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0){
                result.append("I love ");
            }
            else{
                result.append("I hate ");
            }
            if (i != n){
                result.append("that ");
            }
        }
        import java.util.Scanner;
public class SubstringCompanion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        
         for (int i = 0; i < length; i++) { 
            for (int j = i + 1; j <= length; j++) { 
                     System.out.println(input.substring(i, j));
            }
        }
        sc.close();
   }
}
        result.append(" it");
        System.out.println(result.toString());
        sc.close();
    }
}