import java.util.Scanner;
import java.util.Arrays;

public class SerejaAndDima{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] points = new int[n];
        for(int i = 0 ; i < n ; i++){
            points[i] = sc.nextInt();
        }
        int pointsOfSereja = 0;
        int pointsOfDima = 0;
        int p1 = 0;
        int p2 = n-1;
        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                if(points[p1] > points[p2]){
                    pointsOfSereja += points[p1];
                    p1++;
                }
                else{
                    pointsOfSereja += points[p2];
                    p2--;
                }
            }
            else{
                if(points[p1] > points[p2]){
                    pointsOfDima += points[p1];
                    p1++;
                }
                else{
                    pointsOfDima += points[p2];
                    p2--;
                }
            } 
        }
        System.out.println(pointsOfSereja);
        System.out.println(pointsOfDima);
    }
}
