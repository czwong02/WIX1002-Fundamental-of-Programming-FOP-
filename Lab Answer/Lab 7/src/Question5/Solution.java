
package Question5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Solution {
    public static void main(String[] args) {
    String filename = "person.dat";
    try {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
        int total = inputStream.readInt();
        String[] name = new String[total];
        int[] age = new int[total];
        char[] gender = new char[total];
        
        for(int i = 0; i<total; i++) {
            name[i] = inputStream.readUTF();
            age[i] = inputStream.readInt();
            gender[i] = inputStream.readChar();
        }
        
        int[] index = new int[total];
        for(int i = 0; i<total; i++) {
            index[i] = i;
        }
        
        boolean sorted = false;
        do {
            sorted = true;
            for(int i = 0; i+1<total; i++) {
                int curl = index[i];
                int next = index[i+1];
                if(name[curl].compareTo(name[next])>0) {
                    int tmp = index[i];
                    index[i] = index[i+1];
                    index[i+1] = tmp;
                    sorted = false;
                }
            }
        } while(!sorted);
        
        for(int i = 0; i<total; i++){
            int curl = index[i];
            System.out.printf("%-20s%10d%10s\n", name[curl], age[curl], (gender[curl]== 'M') ? "Male":"Female");
        }
        inputStream.close();
    } catch(FileNotFoundException e) {
        System.out.println("File was not found");
    } catch (IOException e) {
        System.out.println("Problem with file input.");
    }
}
}
