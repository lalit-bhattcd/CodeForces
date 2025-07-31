// import java.util.*;
// public class SpellCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = "Timru";
//         int t = sc.nextInt();
//         sc.nextLine();
//         while(t-- > 0){
//             int length = sc.nextInt();
//             sc.nextLine();
//             String input = sc.nextLine();
//             if(a.length() != length){
//                 System.out.println("NO");
//                 continue;
//             }
//             char[] chars = input.toCharArray();

//             Arrays.sort(chars);

//             String sorted = new String(chars);
//             if(sorted.equals(a)){
//                 System.out.println("YES");
//             }
//             else{
//                 System.out.println("NO");
//             }
//         }
//     }   
// }
import java.util.*;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Build frequency for "Timur"
        int[] correctFreq = new int[128]; // ASCII range
        for (char c : "Timur".toCharArray()) {
            correctFreq[c]++;
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            String input = sc.next();

            if (len != 5) {
                System.out.println("NO");
                continue;
            }

            int[] freq = new int[128];
            for (char c : input.toCharArray()) {
                freq[c]++;
            }

            if (Arrays.equals(freq, correctFreq)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

