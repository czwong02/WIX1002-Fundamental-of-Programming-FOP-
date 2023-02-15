
package Question1;

public class Tester {
    public static void main(String[] args) {
    
        Rectangle rectangle = new Rectangle();
        rectangle.setLength();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.display();

        Square square = new Square();
        square.setLength();
        square.calculatePerimeter();
        square.calculateArea();
        square.display();

        Circle circle = new Circle();
        circle.setDiameter();
        circle.calculatePerimeter();
        circle.calculateArea();
        circle.display();
    }
}
