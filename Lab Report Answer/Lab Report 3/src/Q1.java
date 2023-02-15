
public class Q1 {
    public static void main(String[] args) {
    Money money1 = new Money();
    money1.call(money1);
   // amount of money
    int amount = 81350;
    Money money2 = new Money(amount);
    money2.call(money2);
    //amounts of money
    int[] amounts = {8150, 18212, 5236};
    Money money3 = new Money(amounts);
    money3.call(money3);

}
}