import java.util.Scanner;
public class Typeconversion{
    public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                
                while (t-- > 0) {
                    int numStr = sc.nextInt();
                    int lenStr = sc.nextInt();
                    sc.nextLine(); 
        
                    
                    String str1 = sc.nextLine();
                    String str2 = sc.nextLine();
                    
        
                    int totalMoves = 0;
                    for (int i = 0; i < lenStr; i++) {
                        if (str1.charAt(i) != str2.charAt(i)) {
                            char ch1 = str1.charAt(i);
                            char ch2 = str2.charAt(i);
                            totalMoves += Math.abs(ch1 - ch2); 
                        }
                    }
                    System.out.println(totalMoves);
                }
                sc.close();
            }
    }