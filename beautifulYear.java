import java.util.Scanner;

public class beautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year++;

        while (!isBeautifulYear(year)) {
            year++;
        }

        System.out.println(year);
    }

    public static boolean isBeautifulYear(int year) {
        String yearStr = Integer.toString(year);
        for (int i = 0; i < yearStr.length(); i++) {
            if (yearStr.indexOf(yearStr.charAt(i)) != yearStr.lastIndexOf(yearStr.charAt(i))) {
                return false;
            }
        }
        return true; 
    }
}