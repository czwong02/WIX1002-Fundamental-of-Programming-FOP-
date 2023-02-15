
package Question1;

public class Tester {

    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);
        
        a.display();
        a.evenNumber();
        a.primeNumber();
        a.max();
        a.min();
        a.average();
        a.square();
        System.out.println("");
        
        b.display();
        b.evenNumber();
        b.primeNumber();
        b.max();
        b.min();
        b.average();
        b.square();
        System.out.println("");
        
        c.display();
        c.evenNumber();
        c.primeNumber();
        c.max();
        c.min();
        c.average();
        c.square();
    }
}
