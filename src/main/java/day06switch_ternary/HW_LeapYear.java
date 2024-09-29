package day06switch_ternary;

import java.util.Scanner;

public class HW_LeapYear {
    public static void main(String[] args) {

           /*
        Write a Java program to determine if a given year is a leap year or not.
        A year is a leap year if:
            It is divisible by 4.
            It is divisible by 100, it must also be divisible by 400.

            NOTE: Use ternary

Example:
Year 2000: Divisible by 4, 100, and 400 → Leap Year.
Year 1900: Divisible by 4 and 100, but not by 400 → Not a Leap Year.
Year 2024: Divisible by 4 and not by 100 → Leap Year.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Year to find out if it is a Leap Year or not");
        int year = scanner.nextInt();

        String result = (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year%100==0 && year%400==0) ? "a Leap Year" : "not a Leap Year";

        System.out.println(year + " is " + result);




    }
}
