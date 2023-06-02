package java_week_3_writing_hw_ksp;
import java.util.Scanner;

/**
 * Write a program that tells us input value i number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner v1 = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = v1.next().charAt(0);
        //Object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        v1.close();
    }
    // Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}
