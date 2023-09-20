package mini_games;

import java.util.Scanner;

public class FillInTheBlankStory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings Guardian!");
        System.out.println("Let's create a fun story!");

        //prompt for an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        //prompt for favorite season
        System.out.println("What is your favorite season of the year?");
        String season = scanner.next();

        //prompt for whole number
        System.out.println("Please enter a random whole number");
        int number = scanner.nextInt();

        //prompt for floating-point number
        System.out.println("If you buy one bag of chips at $1.50 with a $5 bill, How much change will you have?");
        double floatingNumber = scanner.nextDouble();

        //prompt for coffee type preference (true for hot, false for cold)
        System.out.println("Do you prefer your coffee hot or cold? Hot = True & False = Cold");
        boolean coffeeType = scanner.nextBoolean();

        scanner.close();
        //Inputs incorporated into the story
        if (coffeeType) {
            System.out.println("On a(n) " + adjective + " " + season + " " + " day, I drink a minimum of "
                    + number + " cups of," + coffeeType + "coffee.");
        } else {
            System.out.println("\"On a(n) \" + adjective + \" \" + season + \" \" + \" day, I drink a minimum of \"\n" +
                    "                + number + \" cups of,\" + coffeeType + \"coffee.\");");
        }
        System.out.println("I have spent,$" + floatingNumber + ",on coffee this month.");
    }
}

