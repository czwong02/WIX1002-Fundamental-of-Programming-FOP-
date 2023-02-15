
package Question4;

import java.util.Scanner;

public class Solution {
    public static void printCalendar(int month, int firstDay) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = daysInMonth[month];
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d", i);
            if ((firstDay + i - 1) % 7 == 6) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();
        input.close();

        System.out.println("May " + year);
        printCalendar(5, (firstDay + 31) % 7);

        System.out.println("August " + year);
        printCalendar(8, (firstDay + 31 + 30 + 31) % 7);
    }
}
