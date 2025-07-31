import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class CaseOfZeroAndOnes{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    String s = sc.next();

    int total_zeros = 0;
    int Total_ones = 0;
    for(int i = 0 ; i < length; i++ ){
        if(s.charAt(i) =='0'){
            total_zeros++;
        }
        else{
            Total_ones++;
        }
    }
    int remove = 0;
    if(total_zeros > Total_ones){
        remove = Total_ones+Total_ones;
        length-=remove;
    }
    else{
        remove = total_zeros+total_zeros;
        length-=remove;
    }
    System.out.println(length);
    }
}