package Java_Week8_Homework_SanketPatel;

public class Point {

    //instance variable
    int x;
    int y;

    //Constructor with zero args
    Point() {
    }

    //parameterised constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

