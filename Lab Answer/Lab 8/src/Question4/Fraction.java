
package Question4;

public class Fraction {
    private int num;
    private int denom;

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
    
    public void display() {
        System.out.println(num +"/"+denom);
    }
}
