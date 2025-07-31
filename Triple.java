import java.util.Arrays;
import java.util.Scanner;
public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int length = sc.nextInt();
            int arr[] = new int[length];

            for(int i = 0; i  < arr.length; i++){
                arr[i] = sc.nextInt();
            }


            if(length < 3){
                System.out.println(-1);
                continue;
            }
            Arrays.sort(arr);

            int answer = -1;
            int tripleCount = 1;
            for(int i = 1 ; i < length; i++ ){
                if(arr[i] == arr[i-1]){
                    tripleCount++;
                    if(tripleCount == 3){
                        answer = arr[i];
                        break;
                    }
                }
                else{
                    tripleCount = 1;
                }
            }
            System.out.println(answer);
        }
    }
}
