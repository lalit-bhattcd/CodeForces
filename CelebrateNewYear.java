import java.util.*;

public class CelebrateNewYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) { 
            int FriendOne = sc.nextInt();
            int FriendTwo = sc.nextInt();
            int FriendThree = sc.nextInt();

            int[] Positions = {FriendOne, FriendTwo, FriendThree};
            Arrays.sort(Positions);

            int MidPoint = Positions[1]; 
            int Travel = Math.abs(MidPoint - FriendOne) + Math.abs(MidPoint - FriendTwo) + Math.abs(MidPoint - FriendThree);
            System.out.println(Travel);
        }
        sc.close();
    }
}

