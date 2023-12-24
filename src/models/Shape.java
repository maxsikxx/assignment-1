package models;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Map;

public class Shape {

    private ArrayList<Point> points = new ArrayList<Point>();

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {  // This method adds a point to the points array.
        points.add(point);
    }

    public double calculatePerimeter() {  // This method returns the sum of all lengths
        double perimeter = 0;
        int len = points.size();
        for (int i = 0; i < len - 1; i++) {
            perimeter += points.get(i).distance(points.get(i+1));
        }
