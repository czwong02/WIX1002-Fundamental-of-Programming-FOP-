package Question1;

import java.util.Scanner;

public class Shape {
    private String name;
    private double perimeter, area;
    
    public Scanner input = new Scanner(System.in);

    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void display() {
        System.out.println("Shape: " + name);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}