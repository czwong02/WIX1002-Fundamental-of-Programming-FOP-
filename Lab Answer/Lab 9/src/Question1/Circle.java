package Question1;

public class Circle extends Shape {
    private double diameter;
    
    public Circle() {
        super("Circle", 0,0);
    }
    
    public void setDiameter() {
        System.out.print("Diameter of the circle: ");
        diameter = input.nextDouble();
    }
    
    public void calculateArea() {
        setArea(Math.PI*Math.pow((diameter/2),2));
    }
    
    public void calculatePerimeter() {
        setPerimeter(Math.PI*diameter);
    }
}