
package Question3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Lecturer extends PersonProfile {

    private String[] courseName;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] creditHour;
    private int[] numOfStudents;

    public Lecturer(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);

        try {
            Scanner sc = new Scanner(new File(fileName + ".txt"));
            int lines = 0;

            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }

            sc.close();

            int entries = lines / 6;
            courseName = new String[entries];
            courseCode = new String[entries];
            session = new int[entries];
            semester = new int[entries];
            creditHour = new int[entries];
            numOfStudents = new int[entries];

            sc = new Scanner(new File(fileName + ".txt"));

            for (int i = 0; i < entries; i++) {
                courseCode[i] = sc.nextLine();
                courseName[i] = sc.nextLine();
                session[i] = sc.nextInt();
                semester[i] = sc.nextInt();
                creditHour[i] = sc.nextInt();
                numOfStudents[i] = sc.nextInt();
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
            sc.close();

            computeCreditHour();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    private void computeCreditHour() {
        int N = creditHour.length;
        for (int i = 0; i < N; i++) {
            if (numOfStudents[i] >= 150) {
                creditHour[i] *= 3;
            } else if (numOfStudents[i] >= 100) {
                creditHour[i] *= 2;
            } else if (numOfStudents[i] >= 50) {
                creditHour[i] *= 1.5;
            } else {
                creditHour[i] *= 1;
            }
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("");
        System.out.println("Course Details");
        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("Course Name: %s\n"
                    + "Course Code: %s\n"
                    + "Semester: %d\n"
                    + "Session: %d\n"
                    + "Credit Hour: %d\n"
                    + "Number of Students: %s\n", courseName[i], courseCode[i], semester[i], session[i], creditHour[i], numOfStudents[i]);
            System.out.println("");
        }
    }
}