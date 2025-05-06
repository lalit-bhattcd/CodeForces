import java.util.Scanner;
public class DominozPilling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int area = M * N;
        int Squares = 0; 
        int AreaOfsquare = 2;
        for(int i = 2 ; i <= area; i = i+2){
            Squares++;
        }   
        System.out.println(Squares);
    }
}
//We can simply do this by dividing area of te whole box by the area of a single piece like area/2(given area of a piece) this is from chatgpt ik but i make this easy 
//question too complicated im no goodddd.......