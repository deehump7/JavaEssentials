package practice;

import java.util.Scanner;

public class dayOfWeek {

    public static void main(String[] args) {
        // 1. Loop to display a string 99 times.
        String message = "Java is Fun!";
        for (int i = 0; i < 99; i++) {
            System.out.println(message);
        }

        // 2. Loop to display every odd number from 0 to 99.
        for (int i = 1; i <= 99; i += 2) {
            System.out.println("Odd number: " + i);
        }

        // 3. Loop to display every even number from 0 to 99.
        for (int i = 0; i <= 99; i += 2) {
            System.out.println("Even number: " + i);
        }

        // 4. Loop to display every even number from 0 to 99 using a different method.
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }

        // 5. Loop to sum up the odd numbers from 0 to 99 and print it at the end.
        int sumOdd = 0;
        for (int i = 1; i <= 99; i += 2) {
            sumOdd += i;
        }
        System.out.println("The sum of all the odd numbers from 0 to 99 is: " + sumOdd);

        // 6. Loop to sum up the even numbers from 0 to 99 and print it at the end.
        int sumEven = 0;
        for (int i = 0; i <= 99; i += 2) {
            sumEven += i;
        }
        System.out.println("The sum of all the even numbers from 0 to 99 is: " + sumEven);

        // 7. Loop to find the sum of the numbers between two numbers given by the user, inclusive.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int num1 = scanner.nextInt();

        System.out.println("Please enter your second number:");
        int num2 = scanner.nextInt();

        scanner.close();
        if (num2 < num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sumTotal = 0;
        for (int i = num1; i <= num2; i++) {
            sumTotal += i;
        }
        System.out.println("The total sum of the numbers between " + num1 + " and " + num2 + " is: " + sumTotal);
    }
}
