package day02variables_concatenation;

public class Variable02 {
    public static void main(String[] args) {

        //      COMPARISON OPERATORS

        /*
        They're mostly used in Conditional statements.
        EQUAL TO: '=='  => represents equality in JAVA
                  '=' is called ASSIGNMENT OPERATOR => takes the data from the right side and assigns it to the left side (to the variable)

        NOT EQUAL TO: '!='  => represents not equal in JAVA
        myAge = 30; // assignment operator

        myAge == 30
        myAge != 30

        GREATER THAN:   '>'   => 9>5
        LESS THAN :     '<'   => 5<10

        GREATER THAN or EQUAL TO: '>='    =>  18>=16
        LESS THAN or EQUAL TO:    '<='    =>  14<=19

        //    MATHS OPERATIONS

        Addition: +
        Multiplication: *
        Subtraction: -
        Division: /

        // If there's parenthesis in the code line, the operation inside the parenthesis will be done first.
        // Multiplication / division operations have first priority
        // Addition / subtraction have the second priority

        16/4*(2+6) = 32

        30-4+6*9 = 80


        //     LOGICAL OPERATORS

        OR sign: '||' This is quite generous, used for filtration (at least one of the conditions should be fulfilled)
        AND sign: '&&' This is very strict, this is used for filtration (BOTH of the conditions should be fulfilled)

         */

        boolean b1 = true, b2 = true, b3 = false, b4 = 5>8;

        System.out.println(b1 || b2); // true
        System.out.println(b1 || b3); // true
        System.out.println(b1 && b2); // true
        System.out.println(b1 && b3); // false
        System.out.println(b1 && b4); // false
        System.out.println(b2 || b4); // true

        System.out.println("========================");

        boolean x = 10 > 5; // true
        boolean y = 2+3 !=5; // false
        boolean z = 2+3*5 >=19; // false

        System.out.println(x && y); // false
        System.out.println(x || y || z); // true








    }
}
