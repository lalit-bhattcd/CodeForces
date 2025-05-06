import java.util.Scanner;
public class firstWord{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int j = 0 ; j < t ; j++){
            String input = sc.nextLine();
            System.out.print(input.charAt(0));
            for(int i = 0 ; i < input.length(); i++){
                    while(input.charAt(i) == ' '){
                    System.out.print(input.charAt(i+1));
                    i++;
                    }
                }
                System.out.println();
            }
    }
}