package day01_variables;

public class Variables02 {

    public static void main(String[] args) {

        /*

                NON-PRIMITIVE DATA TYPE

        - Primitive data types have 'Values' only. NON-PRIMITIVES have values AS WELL AS methods.
        - Primitive data types are created by JAVA. We cannot create them. NON-PRIMITIVES can be created by us.
        - Primitive data types use lowercase in their names. NON-PRIMITIVES use UPPERCASE in their names
        - Memory usage in Primitive data types change from one data type to the other.
          NON-Primitives use the same amount of memory.

          STRING is one of the NON-PRIMITIVE data types that are created by JAVA.
          It is used to store text (any sequence of letters)
          default value of String is null

         */

        String name = "John";
        System.out.println("name = " + name);

        /*

        There are two types of memory in JAVA
        1) stack: stores a) Primitive data types b) references of non-primitives
            NOTE: Typically, 4 or 8 bytes of fixed memory is allocated to store the references of non-primitives
        2) Heap: It's like a Jungle. All non-primitives are stored in heap memory

         */

        // Create an integer and a two double variable and add them

        int shirt = 25;
        double socks = 12.99, shoes = 54.98;

        System.out.println(shirt + socks + shoes); // 92.97

        // Note: when we use different data types in any maths operation, larger data type will be returned for result

        // Create 2 float variables, 3 short variables and 2 double variables and then print their sum

        float num1 = 12.50f , num2 = 23.99f;
        short num3 = 5, num4 = 9, num5 = 12;
        double num6 = 67.99 , num7 = 0.88;
        System.out.println(num1+num2+num3+num4+num5+num6+num7); // 131.35999786376954

        double sum = num1+num2+num3+num4+num5+num6+num7;
        System.out.println("sum = " + sum);


















    }
}
