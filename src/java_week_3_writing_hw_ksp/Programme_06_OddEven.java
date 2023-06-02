package java_week_3_writing_hw_ksp;
import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it's odd or even
 */
public class Programme_06_OddEven {
    public static void main(String[] args) {
        //Sanner declaration for reading input from console
        Scanner v1 = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = v1.nextInt();
        Programme_06_OddEven oddEven = new Programme_06_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenorOddNumber(number) + " number");
        //Closing the scanner object
        v1.close();
    }
    //checking the odd or even
    public String isItEvenorOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
    return "Odd";
}}}
