
package Question6;

public class Tester {
    public static void main(String[] args) {
        Burger stalk1 = new Burger("Ramly Burger");
        Burger stalk2 = new Burger("Pelangi Burger", 23);
        stalk1.sold(12);
        stalk1.display();
        stalk2.sold(23);
        stalk2.display();
    }
}
