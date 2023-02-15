package Question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    String[][] courseList = {{"WXES1116", "Programming I"}, {"WXES1115", "Data Structure"}, {"WXES1110", "Operating System"}, {"WXES1112", "Computing Mathematics I"}};
    try {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("course.dat"));
        for(int i = 0; i<courseList.length; i++) {
            outputStream.writeUTF(courseList[i][0] + ", " +  courseList[i][1]);
        }
        outputStream.close();
    } catch (IOException e) {
        System.out.println("Problem with file output");
    }
    
    Scanner input = new Scanner(System.in);
    String[][] list = new String[4][2];
    
    try {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("course.dat"));
        
        for(int i = 0; i<list.length; i++) {
            String temp = inputStream.readUTF();
            list[i] = temp.split(", ");
        }
        inputStream.close();
    } catch(FileNotFoundException e) {
        System.out.println("File was not found");
    } catch(IOException e) {
        System.out.println("Problem with file input");
    }
    
        System.out.print("Enter a course code: ");
        String courseCode = input.nextLine();
        
        String courseName="";
        for(int i = 0; i<list.length; i++) {
            if(courseCode.equals(list[i][0])) {
                courseName = list[i][1];
            }
        }
        
        if(courseName.equals("")) {
            System.out.println("This course does not exist.");
        } else {
            System.out.println("This course is " + courseName);
        }
}
}