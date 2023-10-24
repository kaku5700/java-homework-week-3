import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator(?:)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //scanner declaration for input data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Number : ");
        int number = scanner.nextInt();
        IsItOddOrEvenNumber(number);
        scanner.close();//closing scanner
    }

    //Checking the number is even or odd
    public static void IsItOddOrEvenNumber(int number) {
        //Ternary Operator is Used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
