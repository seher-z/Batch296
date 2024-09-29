package day12loops;

public class Loop02 {
    public static void main(String[] args) {

         /*
        Example: Print the unique (not-repeated) characters from the given String
         "Hello" => "Heo"  "Loops" => "Lps"

         HINT:
         indexOf()  => returns the first occurrence of the given character
         lastIndexOf()  => returns the last occurrence of the given character
         */

        String str = "Loops";

        String unique = "";

        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){

                unique = unique + ch;
            }
            System.out.println(unique);
        }

        System.out.println("unique = " + unique);  // unique = Lps



















    }
}
