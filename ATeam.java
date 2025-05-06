import java.util.Scanner;
public class ATeam{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int solveProblem = 0;
     for(int i = 0 ; i < n ; i++){
        int patya = sc.nextInt(); 
        int vedya = sc.nextInt();
        int tonya = sc.nextInt();
    if(patya + vedya + tonya >= 2){
        solveProblem++;
        }
    }
    System.out.println(solveProblem);

    }
}