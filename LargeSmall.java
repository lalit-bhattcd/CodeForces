import java.util.Scanner;
import java.util.Arrays;
public class LargeSmall{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int max = 0;
        int min =array[0];
        for(int i = 0 ; i < array.length; i++){
            array[i] = sc.nextInt();
           if(array[i] > max){
            max = array[i];
           }
            else if(array[i] < min){
            min = array[i];
        } 
    }
        System.out.println("Largest value in given array is: " + max);
        System.out.println("Minimum value in given array is: " + min);
    }
}