package Question1;

public class Square extends Shape {
    private double length;
    
    public Square() {
        super("Square", 0, 0);
    }
    
    public void setLength() {
        System.out.print("Length of square: ");
        length = input.nextDouble();
    }
    
    public void calculateArea() {
        setArea(length*length);
    }
    
    public void calculatePerimeter() {
        setPerimeter(4*length);
    }
}