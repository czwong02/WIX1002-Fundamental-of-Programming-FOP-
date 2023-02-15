
package Question3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) {
        String text = "I love Java";
        String reversedText = "";
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("reverse.txt"));
            for(int i = text.length()-1; i>=0; i--) {
                reversedText += text.charAt(i);
            }
            outputStream.print(reversedText);
            outputStream.close();
        } catch(IOException e) {
            System.out.println("Problem with the file output");
        }
    }
}
