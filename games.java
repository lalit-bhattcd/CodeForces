import java.util.Scanner;
public class games{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int changeDress = 0;
        int[] hostUniform = new int[n];
        int[] guestUniform = new int[n];
        for(int i = 0; i < n ; i++){
            hostUniform[i] = sc.nextInt();
            guestUniform[i] =  sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0 ;j < n; j++){
            if(hostUniform[i] == guestUniform[j]){
                changeDress += 1;
            }
        }
    }
        System.out.println(changeDress);
}
}