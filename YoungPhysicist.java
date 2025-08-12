import java.util.*;
public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int output = 0;

        for(int i = 0 ; i < t*3 ; i++){
            output += sc.nextInt();
        }
        if(output == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
