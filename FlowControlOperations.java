import java.util.Scanner;

public class FlowControlOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //input for two numbers
        System.out.println("Please enter your first number: ");
        int choice1 = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int choice2 = scanner.nextInt();

        //Verify the difference is at least 200
        int choiceDifference = Math.abs(choice1 - choice2);
        if (choiceDifference < 200) {
            System.out.println("The difference between the numbers is less than 200. The program will now end.");
            return;
        }

        int evenDivBy4Sum = 0;
        int evenDivBy8Sum = 0;
        int notEvenNotDivBy5Sum = 0;

        //iterate from choice1 and choice2 and calculate the sum based on user choice
        System.out.println("Select an operation (1: Even&DivBy4, 2: Even&DivBy8, 3: NotEven&NotDivBy5):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Sum up numbers that are even and divisible by 4
                for (int i = choice1; i <= choice2; i++) {
                    if ( i % 4 == 0) {
                        evenDivBy4Sum += i;
                    }
                }
                System.out.println("Sum of even numbers divisible by 4: " + evenDivBy4Sum);
                break;

            case 2:
                // Sum up numbers that are even and divisible by 8
                int currentNum = choice1;
                while (currentNum <= choice2) {
                    if (currentNum % 8 == 0) {
                        evenDivBy8Sum += currentNum;
                    }
                    currentNum++;
                }
                System.out.println("Sum of even numbers divisible by 8: " + evenDivBy8Sum);
                break;

            case 3:
                // Sum up numbers that are not even and not divisible by 5
                int currentNum2 = choice1;
                do {
                    if (currentNum2 % 2 != 0 && currentNum2 % 5 != 0) {
                        notEvenNotDivBy5Sum += currentNum2;
                    }
                    currentNum2++;
                } while (currentNum2 <= choice2);
                System.out.println("Sum of numbers not even and not divisible by 5: " + notEvenNotDivBy5Sum);
                break;

            default:
                System.out.println("Invalid choice. Program will end.");
        }
}}
