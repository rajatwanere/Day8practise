package day8assignment;

import java.util.Scanner;

public class Arithmeticoperator {

        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number (b): ");
            int b = scanner.nextInt();

            System.out.print("Enter the third number (c): ");
            int c = scanner.nextInt();

            // Find max and min
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));

            // Perform arithmetic operations
            int result1 = a + b * c;
            int result2 = c + a / b;
            int result3 = a % b + c;
            int result4 = a * b + c;

            // Print the results
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("a + b * c: " + result1);
            System.out.println("c + a / b: " + result2);
            System.out.println("a % b + c: " + result3);
            System.out.println("a * b + c: " + result4);
        }
    }

