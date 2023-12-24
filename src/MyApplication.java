import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\C++\\maks\\src\\points.txt");
        Shape shape = readShapeFromFile(file);
        System.out.println("The perimeter: " + shape.calculatePerimeter());
        System.out.println("The longest side: " + shape.getLongestSide());
        System.out.println("The average side: " + shape.getAvgSide());
    }

    public static Shape readShapeFromFile(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        return shape;
    }
}