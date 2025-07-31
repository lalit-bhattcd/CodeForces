import java.util.*;
public class minutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            if(m > 0){
                h++;
                int hrLeft = (24-h);
                int minLeft = (60 - m);
                int TotalTime = (hrLeft*60) + minLeft;
                System.out.println(TotalTime);
            }
            else{
                int TotalTime =  (24-h) * 60;
                System.out.println(TotalTime);
            }
        }
        sc.close();
    }
}
