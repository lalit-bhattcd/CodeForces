import java.util.Scanner;
public class YesOrYes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] input = new String[t];
        for(int i = 0 ; i < t ; i++)
        {
            input[i] = sc.nextLine();
        }
        sc.close();
        for(int i = 0 ; i < t ; i++){
            if(input[i].equalsIgnoreCase("YES")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}