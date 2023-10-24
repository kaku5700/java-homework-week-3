import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYearOrNot {
    public static void main(String[] args) {
        //scanner declaration for input data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = scanner.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        scanner.close();
    }

}

