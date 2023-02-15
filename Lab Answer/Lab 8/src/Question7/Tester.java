
package Question7;

public class Tester {
    public static void main(String[] args) {
        Money money1 = new Money(10.11);
        money1.call(money1);
        
        Money money2 = new Money(10.12);
        money2.call(money2);
        
        Money money3 = new Money(10.13);
        money3.call(money3);
        
        Money money4 = new Money(10.14);
        money4.call(money4);

        Money money5 = new Money(10.15);
        money5.call(money5);
        
         Money money6 = new Money(10.16);
        money6.call(money6);
        
         Money money7 = new Money(10.17);
        money7.call(money7);
        
        Money money8 = new Money(10.18);
        money8.call(money8);
        
         Money money9 = new Money(10.19);
        money9.call(money9);
        
        money3.addition(money9);
        money4.substraction(money1);
    }
}
