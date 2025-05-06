import java.util.Scanner;
public class InsomaniaCure{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int num = 0;
        for(int i = 0 ; i <= d ; i++){
        if (i % k != 0 && i % l != 0 && i % m != 0 &&i % n != 0) {
            num++;
        }
    }
    if(d < num){
        System.out.println("0");
    }
    else{
    int output = d - num;
    System.out.println(output);
    }
    }
}