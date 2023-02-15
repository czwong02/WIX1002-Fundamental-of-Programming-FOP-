
package Question6;

public class Burger {
    private String burgerStalk;
    private int numberBurgerSold;
    private int totalNumberBurgerSold;
    
    public Burger(String burgerStalk) {
        this.burgerStalk = burgerStalk;
        numberBurgerSold = 0;
    }
    
    public Burger(String burgerStalk, int burgerSold) {
        this.burgerStalk = burgerStalk;
        this.numberBurgerSold = burgerSold;
        totalNumberBurgerSold += burgerSold;
    }
    
    public void sold(int num) {
        numberBurgerSold += num;
        totalNumberBurgerSold += num;
    }
    
    public void display() {
        System.out.println("Burger sold in " + burgerStalk + " is " + numberBurgerSold);
        System.out.println("Total burger sold is " + totalNumberBurgerSold);
    }
}
