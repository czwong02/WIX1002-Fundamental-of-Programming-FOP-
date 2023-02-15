
import java.util.Random;

public class Money {
    Random r = new Random();
    private int amount;
    private int[] amounts;
    private int[] values = {10000, 5000, 2000, 1000, 500, 100, 50, 20, 10, 5, 1};
    
    public Money() {
        this.amount = (int) r.nextInt(10000-1000+1)+1000;
    }
    
    public Money(int amount) {
        this.amount = amount;
    }
    
    public Money(int[] amounts) {
        this.amounts = amounts;
        for (int i = 0; i<amounts.length; i++) {
            Money tmp = new Money(amounts[i]);
            this.add(tmp);
    }
    }
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void add(Money money) {
        this.amount += money.getAmount();
    }
    
    public void call(Money money) {
        int amount = money.getAmount();
        System.out.printf("Amount = %dcents (RM%.2f)\n", amount,(double)amount/100);
        for(int i=0; i<values.length; i++){
            		int cAmount = money.getAmount();
            		int cValue = values[i];
            		int quantity = (int)cAmount/cValue;
            		money.setAmount(cAmount-cValue*quantity);
            		System.out.println(this.toString(cValue, quantity));
        		}
    	}

    	// toString method
    public String toString(int value, int count){
        String statement = "";
            if(value>=100){
            		statement = statement + String.format("RM%-10d",
(int)value/100) + "quantity= "+count;
        		}else{
            		statement = statement + String.format("%-12s",
String.valueOf(value)+"cents") + "quantity= "+count;
        		}
        		return statement;
    	}


}

    
