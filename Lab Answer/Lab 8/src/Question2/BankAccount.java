
package Question2;

public class BankAccount {
    private String name;
    private String IC;
    private double amount;

    public BankAccount(String name, String IC, double amount) {
        this.name = name;
        this.IC = IC;
        this.amount = amount;
    }
    
    public void deposit(double amount) {
        if(amount<0) System.out.println("Invalid transaction");
        else {
            this.amount += amount;
            System.out.println("Deposit successfully to " + name + "'s bank account" );
        }
    }
    
    public void withdraw(double amount) {
        if(this.amount-amount < 0) System.out.println("Invalid transaction");
        else {
            this.amount -= amount;
            System.out.println("Withdraw successfully from " + name + "'s bank account" );
        }
    }
    
    public void displayBalance() {
        System.out.println("-----------------------------");
        System.out.println("Account name: " + name);
        System.out.println("Current balance: RM " + amount);
        System.out.println("-----------------------------");
    }
}
