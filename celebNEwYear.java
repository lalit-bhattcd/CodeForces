import java.util.Scanner;
public class celebNewYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        FriendOne = sc.nextInt();
        sc.nextLine();
        FriendTwo = sc.nextInt();
        sc.nextLine();
        FriendThree = sc.nextInt();
        sc.close();

        int TotalDistence = FriendOne + FriendTwo + FriendThree;
        int MidPoint = TotalDistence / 3;

        int Traval = MidPoint - FriendOne + MidPoint - FriendTwo + MidPoint - FriendThree;
        System.out.println(Traval);
    }
}

