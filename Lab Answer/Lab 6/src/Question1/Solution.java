
package Question1;

public class Solution {

    public static void main(String[] args) {
        displayTriangularNumber();
    }
    
    public static void displayTriangularNumber() {
        int count = 1;
        while(count <= 20) {
            int temp = 0;
            for(int i = 0; i<=count; i++) {
                temp += i;
            }
             System.out.print(temp+" ");
            count++;
        }
        System.out.println("");
    }
}
