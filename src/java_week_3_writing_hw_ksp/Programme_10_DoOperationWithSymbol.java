package java_week_3_writing_hw_ksp;
import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Substraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner v1 = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x = v1.nextInt();
        System.out.println("Enter the second number : ");
        int y = v1.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char symbol = v1.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        //Closing the scanner object
        v1.close();
    }
    // Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }
}