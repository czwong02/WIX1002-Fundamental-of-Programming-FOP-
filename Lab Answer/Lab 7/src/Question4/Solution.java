
package Question4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        int line = 0;
        int character = 0;
        int words = 0;
        try {
            Scanner inputStream = new Scanner(new FileInputStream("course.txt"));
            while(inputStream.hasNext()) {
                String sentence = inputStream.nextLine();
                line++;
                for(int i = 0; i<sentence.length(); i++) {
                    if(Character.isLetter(sentence.charAt(i))) {
                        character++;
                    }
                }
                words += sentence.split(" ").length;
            }
            System.out.println("Number of line: " + line);
            System.out.println("Number of character: " + character);
            System.out.println("Number of words: " + words);
            inputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found");
        }
    }
}
