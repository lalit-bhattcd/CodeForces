import java.util.Scanner;
public class VanyaAndFance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int width = 0;
        int n = sc.nextInt(); //The number of friends
        int h = sc.nextInt(); // The height of the fance
        for(int i = 0 ; i < n ; i++){
            int height = sc.nextInt();
            if(height <= h){
                width++;
            }
            else{
                width = width+2;
            }            
        }
        System.out.println(width);
        sc.close();
    }
}