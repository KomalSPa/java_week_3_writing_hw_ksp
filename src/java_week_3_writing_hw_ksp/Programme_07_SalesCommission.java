package java_week_3_writing_hw_ksp;
import java.util.Scanner;

/**
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt;= 10,000 2%
 *
 */
public class Programme_07_SalesCommission {
    public static void main(String[] args) {

    //Scanner declaration for reading input from console
    Scanner v1 = new Scanner(System.in);
    System.out.println("Enter seller Name: ");
    String name = v1.nextLine();
    System.out.println("Enter Seller ID:");
    int sellerID = v1.nextInt();
    System.out.println("Enter Sales Amount:");
    int salesAmount = v1.nextInt();
    System.out.println("Enter Basic Salary: ");
    int basicSalary = v1.nextInt();
    // Creating the object to call instance method
    Programme_07_SalesCommission salesCommission = new Programme_07_SalesCommission();
    int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
    System.out.println("Seller name is                  :" + name);
    System.out.println("Seller id is                    :" + sellerID);
    System.out.println("Seller's sales amount is        :" + salesAmount);
    System.out.println("Seller's basic salery is        :" + basicSalary);
    System.out.println("Seller's gross salary is        :" + grossSalary);
    // Closing the scanner object
    v1.close();
    }
    // Calculate the sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}