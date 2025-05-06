import java.util.Scanner;
public class restoringThreeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] GroupOfNum = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            GroupOfNum[i] = sc.nextInt();
        }
        int temp = GroupOfNum[0];
        for(int i = 0 ; i < 4 ; i++){
           
            if(temp < GroupOfNum[i]){
                temp = GroupOfNum[i];
            }
        }
            for(int i = 0 ; i < 4 ; i++){
                if(temp != GroupOfNum[i]){
                int outPut = temp - GroupOfNum[i];
                System.out.println(outPut);
                }
            }
        }
}