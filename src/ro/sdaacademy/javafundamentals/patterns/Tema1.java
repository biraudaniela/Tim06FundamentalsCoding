/*Program to find letters, numbers, words and sentences in a given text.
    Your program should support the following operations and display a menu to choose your option:
Count the total number of letters in the text
Count all words that contain a double l
Print all words that contain a double l that is not followed by an o character
Print all sentences that have 5 words exactly
Compute and print the sum for all the numbers that appear in the text
(Bonus) Print the last three letters in all the 6 letter words that start with a vowel.
        0. Exit"


Hints:
For the sample text, you should find there are 2451 letters
Would be useful to use an incrementing counter
Digits are not letters :)
For the sample text there are 11 such words
Words can start / end with double l (lower case L)
For the sample text there are 7 such words
Allibaba should match
Alloha should not match
For the sample text: you should find there are 6 such sentences
Sentences start with a capital letter
Sentences end with a period (”.”)
A number counts as 1 word (123 is a number with 3 digits, is still considered 1 word)
For the sample text, sum is 278.51
Numbers can have a decimal parts as well (1.3)
For the sample text: you should find there are 7 such words
Vowels are : a, e, i, o, u
Might be helpful to include word delimiters in your search pattern
Don’t forget about capital letters


We can start with printing the menu
Next step we would read the option
A switch could help with separate logic for each of the options
To do regex pattern matching in java we need to:
Define the regex as String
Create a Pattern
Get a Matcher from the Pattern
You can use https://regex101.com website to help with regexes
You can paste in the full text from below
Since each of the options will require different regexes we will need to define a new Pattern + Matcher for every option separately
Optional* - A method that takes a regex String as an argument and returns a Matcher might help reduce code duplication

You can use the Homework.java file provided. Or if you want to start from scratch, here is the sample text you can use:
*/


package ro.sdaacademy.javafundamentals.patterns;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static ro.sdaacademy.javafundamentals.patterns.Homework.inputText;

public class Tema1 {
    public static void printMatch (String regex, int groupCount) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(inputText);

        while (m.find()) {
            System.out.println(m.group(groupCount));
        }
    }
    public static int Counter(String regex){
        int count = 0;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(inputText);
        while (m.find()) {
            count++;
        }
        return count;

    }
    public static void main(String args[]) {

        System.out.println("1.Count the total number of letters in the text\n" +
                "2.Count all words that contain a double l\n" +
                "3.Print all words that contain a double l that is not followed by an o character\n" +
                "4.Print all sentences that have 5 words exactly\n" +
                "5.Compute and print the sum for all the numbers that appear in the text\n" +
                "6.Print the last three letters in all the 6 letter words that start with a vowel\n" +
                "0.Exit\n");
        System.out.println("Select an option ");

        Scanner in = new Scanner(System.in);
        int optiune = Integer.parseInt(in.nextLine());

        switch (optiune) {
            case 1:
                System.out.println(Counter("[a-z,A-Z]"));
                break;
            case 2:
                System.out.println(Counter("([l|L]{2})"));
                break;
            case 3:
                printMatch("((\\w+[l|L]{2})([^o|^O])(\\w+|\\s))", 0);
                break;
            case 4:
              printMatch("([A-Z]\\w+\\s\\w+\\s\\w+\\s\\w+\\s\\w+\\.)", 0);
               break;
            case 5:
                String regex4 = "((\\d+)(\\.?)(\\d*))";
                Pattern p4 = Pattern.compile(regex4);
                Matcher m4 = p4.matcher(inputText);
                double sum = 0.0;

                while (m4.find()) {
                      sum = sum + Double.parseDouble(m4.group());
                }
                System.out.println(sum);
                break;
            case 6:
              printMatch("((\\s|^)([aeiou]|[AEIOU])([a-z]{2})([a-z]{3})(\\s|\\.|\\;))",5);
                break;
            case 0:
                System.out.println("Exit");
                break;
    }

    }
}
