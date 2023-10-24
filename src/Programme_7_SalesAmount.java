import java.util.Scanner;

public class Programme_7_SalesAmount {
    static int salesID, salesAmount, basicSalary;
    static String name;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Sales ID:");
        salesID = scan.nextInt();
        System.out.println("Please enter Seller's Name:");
        name = scan.next();
        System.out.println("Please enter Sales Amount:");
        salesAmount = scan.nextInt();
        System.out.println("Please enter Basic Salary:");
        basicSalary = scan.nextInt();
        scan.close();
        calculation();
    }
    // Static method with Nested if else calculating the sales commission depending on condition specified.
    public static void calculation() {
        float commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
        } else {
            commission = (salesAmount * 2) / 100;
        }
        System.out.println("The Commission based on entered value is: " + commission);
    }
}
