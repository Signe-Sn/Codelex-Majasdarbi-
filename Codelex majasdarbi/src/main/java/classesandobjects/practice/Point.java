package classesandobjects.practice;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2) {
        int tempx = p2.x;
        p2.x = p1.x;
        p1.x = tempx;

        int tempy = p2.y;
        p2.y = p1.y;
        p1.y = tempy;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}
