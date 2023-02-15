package Question1;

public class Rectangle extends Shape {
    private double length1;
    private double length2;
    
    public Rectangle() {
        super("Rectangle",0,0);
    }
    
    public void setLength() {
        System.out.print("Length of the rectangle: ");
        length1 = input.nextDouble();
        length2 = input.nextDouble();
    }
    
    public void calculatePerimeter() {
        setPerimeter(2*(length1+length2));
    }
    
    public void calculateArea() {
        setArea(length1*length2);
    }
}