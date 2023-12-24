package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double distance(Point point) {
        double xLen = Math.pow(point.getX() - this.x, 2);
        double yLen = Math.pow(point.getY() - this.y, 2);
        return Math.sqrt(xLen + yLen);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point { x=" + x + ", y=" + y + " }";
    }
}