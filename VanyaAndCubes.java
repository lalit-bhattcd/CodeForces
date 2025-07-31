import java.util.*;
public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int boxes = sc.nextInt();
        sc.close();
        int level = 0;
        int i = 1;
        while(i <= boxes){
            level++;
            boxes = boxes-i;
            i = (i+1) + level;
            System.out.println(i);
        }
    System.out.println(level);
    }
}
