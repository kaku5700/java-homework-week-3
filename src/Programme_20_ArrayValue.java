import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_ArrayValue {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value to check if it is stored in array:");
        int toFind = scan.nextInt();
        scan.close();
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " is stored in array.");
        } else {
            System.out.println(toFind + " is not stored in array.");
        }
    }

}
