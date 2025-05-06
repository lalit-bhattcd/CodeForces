import java.util.Scanner;
public class inSearchOfAnEasyProblem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int i;
        for(i = 0 ; i < n; i++){
                array[i] = sc.nextInt();
            }

            for(i = 0 ; i < n; i++){
                if(array[i] == 1){
                    System.out.println("HARD");
                    return;
                }
            }
            System.out.println("EASY");
   }
}