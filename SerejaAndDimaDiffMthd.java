import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SerejaAndDimaDiffMthd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] points = new Integer[n]; 
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        Arrays.sort(points, Collections.reverseOrder());

        int pointsOfSereja = 0;
        int pointsOfDima = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                pointsOfSereja += points[i]; // Sereja picks first
            } else {
                pointsOfDima += points[i]; // Dima picks next
            }
        }

        System.out.println(pointsOfSereja);
        System.out.println(pointsOfDima);
    }
}
