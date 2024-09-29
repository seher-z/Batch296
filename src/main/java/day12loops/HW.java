package day12loops;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        // Task 1: Type code to multiply counting numbers from 3 to 8 using loops

        int multiplication = 1;

        for (int x = 3; x < 9; x++){

            multiplication = multiplication * x;

            System.out.println("multiplication = " + multiplication);
        }

        System.out.println("multiplication = " + multiplication); // 20160





        // Task 2: Calculate total value of first two digits and last two digits in the given integer
        // 1997 => 19 + 97 = 116

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digits");
        int number = scanner.nextInt();











        // Task 3: // Calculate the total value of decimal part of the given number
        // 459.789 => 789 => 7+8+9 => 24





    }
}
