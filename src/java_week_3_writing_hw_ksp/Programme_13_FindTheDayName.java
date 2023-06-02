package java_week_3_writing_hw_ksp;
import java.util.Scanner;
public class Programme_13_FindTheDayName {
/**
 * Write a Java program which input any number between 1 to 7 and it print the Days
 * name MONDAY, TUESDAY..., SUNDAY of the weel accordingly by using switch.
 * NOTE: if number is out of selection Print message £Week contains 1 to 7 days"
 */
public static void main(String[] args) {
    //Scanner declaration for reading input from console
    Scanner v1 = new Scanner(System.in);
    System.out.println("Input a number between 1 and 7 : ");
    int day = v1.nextInt();
    findTheDaysName(day);
    //Closing the scanner object
    v1.close();
}
//Finding the name of the day
    public static void findTheDaysName(int day) {
    switch (day) {
        case 1:
            System.out.println("Its Monday");
            break;
        case 2:
            System.out.println("Its Tuesday");
            break;
        case 3:
            System.out.println("Its Wednesday");
            break;
        case 4:
            System.out.println("Its Thursday");
            break;
        case 5:
            System.out.println("Its Friday");
            break;
        case 6:
            System.out.println("Its Saturday");
            break;
        case 7:
            System.out.println("Its Sunday");
            break;
        default:
            System.out.println("Week contains 1 to 7 days");
    }
    }
}