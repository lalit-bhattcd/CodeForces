import java.util.Scanner;

public class theatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(); // height of rectangle
        long m = sc.nextLong(); // width of rectangle
        long a = sc.nextLong(); // side of square tile

        long tilesAlongLength = (n + a - 1) / a;
        long tilesAlongWidth = (m + a - 1) / a;

        long totalTiles = tilesAlongLength * tilesAlongWidth;

        System.out.println(totalTiles);
    }
}
