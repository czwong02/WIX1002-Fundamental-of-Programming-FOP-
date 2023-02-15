
package Question3;

public class WeightCalculator {
    private int age;
    private double height;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
    }
    
    public void display() {
        double recommendWeight = (height-100+age/10)*0.9;
        System.out.printf("Recommend weight: %.2fkg\n", recommendWeight);
        
    }
}
