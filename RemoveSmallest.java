import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.utit.Collactions;
public class RemoveSmallest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
  
        while(t-- > 0){
            int length = sc.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>(length);
            for(int i = 0 ; i < length; i++){
               numbers.add(sc.nextInt());
        }
        Collactions.sort(arr);
        if(numbers.get(0).equalenumbers(numbers(length-1))){
            System.out.println("YES");
        }
        else{
            for(int i = 0 ; i < length ;  i++){
                for(int j = 1 ; i < length ; j++){
                    if(numbers.get(i) - numbers.get(j) <= 1){
                       if(numbers.get(i) > numbers.get(j)){
                        numbers.remove(k);
                       }
                       else{
                        numbers.remove(j);
                       }
                    }
                }
        }
        if(numbers.size() > 1){
            System.out.print("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
    }
}