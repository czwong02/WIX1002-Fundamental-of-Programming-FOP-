
package Question6;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        String[][] order = new String[5][5];
        try {
            Scanner inputStream = new Scanner(new FileInputStream("order.txt"));
            for(int i = 0; i<order.length; i++) {
                String temp = inputStream.nextLine();
                String[] orders = temp.split(",");
                order[i][0] = orders[1];
                order[i][2] = orders[2]; 
            }
            inputStream.close();
        } catch(Exception e) {
            System.out.println("File was not found");
        }
        
        String[][] product = new String[7][3];
        try {
            Scanner inputStream = new Scanner(new FileInputStream("product.txt"));
            for(int i = 0; i<product.length; i++) {
                String temp = inputStream.nextLine();
                product[i] = temp.split(",");
            }
            inputStream.close();
        } catch(Exception e) {
            System.out.println("File was not found");
        }
        
        for(int i = 0; i<order.length; i++) {
            for(int j = 0; j<product.length; j++) {
                if(order[i][0].equals(product[j][0])) {
                    order[i][1] = product[j][1];
                    order[i][3] = product[j][2];
                    order[i][4] = String.format("%.2f", Double.parseDouble(product[j][2]) * Double.parseDouble(order[i][2]));
                }
            }
        }
        
        System.out.printf("%-10s%20s%15s%15s%10s%n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
        for(int i = 0; i<order.length; i++) {
            System.out.printf("%-10s%-20s%15s%15s%10s%n", order[i][0], order[i][1], order[i][2], order[i][3], order[i][4]);
        }
    }
}
