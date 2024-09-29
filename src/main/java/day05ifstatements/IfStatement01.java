package day05ifstatements;

public class IfStatement01 {
    public static void main(String[] args) {

        // If statements in Java are like the conditional sentences in English.
        // If it rains, picnic will be cancelled.

       /*
        if (condition){
            This is the body.
            This is where codes are written.
        }
        */

        if (4<8){  // condition is true, body will be executed.
            System.out.println("If you see this message, it means the condition is true.");
        }

        if (5>9){  // condition is not true, body will not be executed. It's grey, because intellij see that the condition is false
            System.out.println("If you see this message, it means the condition.");
        }

        System.out.println("=============================");

        // Example: Print positive if the given digit is greater than zero
        //          Print negative if the given digit is less than zero

        int a = 23;
        if (a>0){
            System.out.println(a + " is a Positive number");  // more fancy
        }
        if (a<0){
            System.out.println("Negative");
        }

        // Example: Print "Digit" on the console if the given number is digit
        // 0-9
        int num = 7;

        if (num>=0 && num<=9){
            System.out.println(num + " is a digit");
        }

        // && operator returns true if BOTH conditions are true (strict)
        // || operator returns true if ANY of the conditions is true (generous)


        // Example: Check if the given number has three digits

        int number = 235;

        if (number > 99 && number < 1000){   // starts by 100 and ends by 999
            System.out.println(number + " has three digits.");
        }



    }
}
