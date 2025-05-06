import java.util.*;
public class beautifulMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = -1;
        int column = -1;
        int[][] matrix = new int[5][5];
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(matrix[i][j] == 1){
                    rows = i;
                    column = j;
                    break;
                }
            }
        }
            int Moves = Math.abs(rows - 2) + Math.abs(column - 2);
            System.out.println(Moves);
            sc.close();
    }
}