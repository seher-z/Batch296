package day04scanner_increment_decrement;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

         /*
         Q.1: Type a code which calculates the area and the perimeter of a square
              whose side length is entered by user.
        Q.2: Type a code which calculates the cube of a number which is entered by user.
        Q.3: Type a code which calculates the area and the perimeter of a circle
            whose radius is entered by user. (Use float)
        Q.4: Type a code which converts the mile to kilometer. Mile value will be
            entered by user. (Use double)
        Q.5: Type a code which converts the hours to seconds. Hours value will be
            entered by user. (Use long)
        Q.6: Type a program which asks user to enter his/her full name, and address
             then print them on the console like the full name should be in the first line,
             and the address will be in the second line.
       */


        // Q.1:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the side length of the square");

        double side = scanner.nextDouble();

        double perimeter = 4*side;

        double area = side*side;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


        // Q.2:
        System.out.println("Please enter a number");
        double num = scanner.nextDouble();
        num = num*3;
        System.out.println("Increased: " + num);


        // Q.3:
        System.out.println("Please enter the radius of the circle");
        float radius = scanner.nextFloat();
        float area2 = (radius*radius)*3.14f;
        float perimeter2 = ((2*radius)*3.14f);
        System.out.println("perimeter2 = " + perimeter2);
        System.out.println("area2 = " + area2);


        // Q.4:
        System.out.println("Please enter the distance in miles");
        double value = scanner.nextDouble();
        double kilometer = value*1.61;
        System.out.println("Distance in Kilometers: " + kilometer);


        // Q.5:
        System.out.println("Enter the hours to convert");
        long hours = scanner.nextLong();
        long seconds = hours*3600;
        System.out.println("The hours in seconds: " + seconds);


        // Q.6:
        System.out.println("Please enter your Firstname and Lastname");
        String fullName = scanner.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("Please enter your address");
        String address = scanner.nextLine();
        System.out.println("address = " + address);




















    }
}
