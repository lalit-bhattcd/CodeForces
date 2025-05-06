import java.util.*;
public class Tram{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // NUMBER OF STOPS
    int capacity = 0;
    int hold = 0;
    for(int i = 0 ; i < n ; i++){
        int enter = sc.nextInt();
        int exit = sc.nextInt();
        hold = hold - exit + enter;
        capacity = Math.max(capacity,hold);
    }
        System.out.println(capacity);
    }
}