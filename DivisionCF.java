import java.util.Scanner;
public class DivisionCF{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int Rating = sc.nextInt();
            if(Rating >= 1900){
                System.out.println("Division 1");
            }
            else if(Rating < 1900 && Rating >= 1600){
                System.out.println("Division 2");
            }
            else if(Rating < 1600 && Rating >= 1400){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");

            }
        }
    }
}