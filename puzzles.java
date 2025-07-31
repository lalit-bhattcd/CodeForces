import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;
public class puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int puzzles[] = new int[n];
        for (int i = 0; i < m; i++) {
            puzzles[i] =sc.nextInt();
        }
        
    }    
}
