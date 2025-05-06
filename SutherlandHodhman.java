import java.util.ArrayList;

class Point {
    double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class SutherlandHodgman {
    static final int LEFT = 1, RIGHT = 2, BOTTOM = 3, TOP = 4;

    public static ArrayList<Point> clipPolygon(ArrayList<Point> polygon, int edge, double value) {
        ArrayList<Point> clipped = new ArrayList<>();
        for (int i = 0; i < polygon.size(); i++) {
            Point S = polygon.get(i);
            Point E = polygon.get((i + 1) % polygon.size());

            boolean S_inside = isInside(S, edge, value);
            boolean E_inside = isInside(E, edge, value);

            if (S_inside && E_inside) {
                clipped.add(E);
            } else if (S_inside) {
                clipped.add(intersection(S, E, edge, value));
            } else if (E_inside) {
                clipped.add(intersection(S, E, edge, value));
                clipped.add(E);
            }
        }
        return clipped;
    }

    static boolean isInside(Point p, int edge, double value) {
        switch (edge) {
            case LEFT: return p.x >= value;
            case RIGHT: return p.x <= value;
            case BOTTOM: return p.y >= value;
            case TOP: return p.y <= value;
        }
        return false;
    }

    static Point intersection(Point S, Point E, int edge, double value) {
        double x = 0, y = 0;
        if (edge == LEFT || edge == RIGHT) {
            x = value;
            y = S.y + (E.y - S.y) * (value - S.x) / (E.x - S.x);
        } else {
            y = value;
            x = S.x + (E.x - S.x) * (value - S.y) / (E.y - S.y);
        }
        return new Point(x, y);
    }

    public static void main(String[] args) {
        ArrayList<Point> polygon = new ArrayList<>();
        polygon.add(new Point(2, 1));
        polygon.add(new Point(4, 2));
        polygon.add(new Point(3, 4));
        polygon.add(new Point(1, 3));

        // Clipping window boundaries
        double left = 1, right = 5, bottom = 1, top = 5;

        // Clip against each boundary
        polygon = clipPolygon(polygon, LEFT, left);
        polygon = clipPolygon(polygon, RIGHT, right);
        polygon = clipPolygon(polygon, BOTTOM, bottom);
        polygon = clipPolygon(polygon, TOP, top);

        // Output clipped polygon
        System.out.println("Clipped Polygon:");
        for (Point p : polygon) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }
}
