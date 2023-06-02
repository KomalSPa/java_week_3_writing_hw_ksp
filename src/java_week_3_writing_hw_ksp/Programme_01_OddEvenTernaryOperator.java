package java_week_3_writing_hw_ksp;
import java.util.Scanner;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_01_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner v1 = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = v1.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        v1.close();
            }
            //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operation is used
        String evenOrOdd = (number % 2 == 0) ? "Even " : "Odd ";
        System.out.println("The " + number + " is " + evenOrOdd + "number");
    }
}
