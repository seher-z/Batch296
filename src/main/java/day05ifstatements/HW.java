package day05ifstatements;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

            /*
         A company decided to give bonus of 5% of salary to the employee if his/her year of
    service is 5 and more than 5 years.

    Ask user for their salary and year of service and print the net bonus amount.
    If employee can not get bonus, print how many years he/she should work more.

    EXAMPLE:
    INPUT  :   Year     => 4 years service
               Salary   => 4000

    OUTPUT:   You need to work 1 more year(s) to get bonus
         */

 // if statement will be enough

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your years of service");
        int yearsOfService = scanner.nextInt();

        System.out.println("Please enter the amount of your salary");
        double salary = scanner.nextDouble();

        if (yearsOfService >= 5){
            double bonus = salary * 5 / 100;
            System.out.println("You get a bonus of: " + bonus + "Dollars.");
        } else {
            int restYears = 5 - yearsOfService;
            System.out.println(" You need to work " + restYears + " years to get the bonus.");
        }


        // Others solution
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of years of your job");
        int year = scan.nextInt();

        System.out.println("Enter your salary");
        double salary1 = scan.nextDouble();  // Class / Instance Variable

        if (year>=5){
            // calculate the bonus
            double bonus = salary1*5/100;
            System.out.println("Your bonus = " + bonus );
            double newSalary = salary1+bonus;
            System.out.println("Your new salary = " + newSalary);

        } else {
            System.out.println("You need to work " + (5-year) + "year(s) more to qualify for a bonus");
        }



        // Others solution 2nd way
        System.out.println("Please enter your years of service: ");
        byte yService = scanner.nextByte();

        if (yService<5){
            System.out.println("Ohhh, sorry. You have no bonus for now. You have to work " + "more year(s) to get a bonus");
        } else {
            System.out.println("Please enter your salary: ");
            double salary2 = scanner.nextDouble();  // Local Variable
            System.out.println("Well done! You have " + salary2*0.05 + "bonus");
        }




    }
}
