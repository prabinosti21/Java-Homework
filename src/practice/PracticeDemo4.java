package practice;

//Write a Java program to find the number of days in a month.

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class PracticeDemo4 {
    static int getNumberOfDaysInMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month =scanner.nextInt(); // For example, 7 represents July
        System.out.println("Enter the year : ");
        int year= scanner.nextInt();
        int numberOfDays = getNumberOfDaysInMonth(year, month);
        System.out.println("Number of days in the " + Year.of(month) + "in year "+ year + " is = " + numberOfDays);
    }
}
