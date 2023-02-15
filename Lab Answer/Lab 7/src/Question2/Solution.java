
package Question2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder();
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            while(in.hasNext()) {
                builder.append(in.nextLine());
            }
           
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("index.html"));
            outputStream.print(builder.toString());
            
            outputStream.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
