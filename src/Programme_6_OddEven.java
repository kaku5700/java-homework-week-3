/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme_6_OddEven {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);//scanner declaration

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        //if else condition finding whether inserted number is odd or even and displaying the message.
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        reader.close();//closing scanner
    }

}
