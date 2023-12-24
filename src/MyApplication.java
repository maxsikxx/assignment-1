import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\\\C++\\\\maks\\\\src\\\\points.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();  // Creates a Shape instance.

        while (sc.hasNext()) {  // Reads the file and adds each point coordinates until there are none.
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("The perimeter: " + shape.calculatePerimeter());
        System.out.println("The longest side: " + shape.getLongestSide());
        System.out.println("The average side: " + shape.getAvgSide());
    }
}