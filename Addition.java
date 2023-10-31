//  Author: Marco Palomino
//    Date: 29 October 2023
//
// Summary: This programs corresponds to Practical 3: Loops, arithmetic
//          operations, and GitHub.

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the start!
        System.out.print("Enter the start number: ");
        int start = input.nextInt();

        // Read the end!
        System.out.print("  Enter the end number: ");
        int end = input.nextInt();

        if (end < start)
            System.out.println("Error: The end must be greater or equal to start.");
        else {
            // Calcualte the sum!
            int sum = 0;
            for (int i = start; i <= end; i++)
                sum += i;

            System.out.printf("The sum is = %d", sum);
        }

    } // End of main
} // End of class Addition
