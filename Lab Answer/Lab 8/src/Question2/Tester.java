
package Question2;

public class Tester {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Wong", "3423421", 45245.42);
        BankAccount user2 = new BankAccount("Ng", "2524525", 6252.12);
        
        user1.deposit(3242.12);
        user1.displayBalance();
        user2.withdraw(123.32);
        user2.displayBalance();
    }
}
