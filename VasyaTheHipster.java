import java.util.Scanner;
public class VasyaTheHipster{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int DifferentSocks = 0;
        int similersocks = 0;
        if(red > blue){
            DifferentSocks = blue;
            red = red-blue;
            blue = 0;
            similersocks = red/2;
        }
        else{
            DifferentSocks = red;
            blue = blue - red;
            red = 0;
            similersocks = blue/2;
        }
        System.out.println(DifferentSocks);
        System.out.println(similersocks);
    }
}