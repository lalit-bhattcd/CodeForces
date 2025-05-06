import java.util.Scanner;
public class AntonandPolyhedron{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numofString = sc.nextInt();
        int numOfSides = 0;
        for(int i = 0 ; i < numofString ; i++){
            String design = sc.next();
            if(design.charAt(0) == 'T'){
                numOfSides += 4;
            }
            else if(design.charAt(0) == 'C'){
                numOfSides += 6;
            }
            else if(design.charAt(0) == 'O'){
                numOfSides += 8;
            }
            else if(design.charAt(0) == 'D'){
                numOfSides += 12;
            }
            else{
                numOfSides += 20;
            }
        }
        System.out.println(numOfSides);
    }
}