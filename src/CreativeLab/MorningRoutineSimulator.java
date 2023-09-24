package CreativeLab;

import java.util.Scanner;

public class MorningRoutineSimulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //data types
        int numberOfCoffees;
        double caffeineIntake;
        boolean isDecaf ;
        float coffeeCost ;
        long coffeeBeans ;
        byte coffeeCreamer;

        //getting user input
        System.out.println("How many cups of coffee do you drink a day? ");
        numberOfCoffees = scanner.nextInt();

        //multiplication arithmetic operator
        caffeineIntake = numberOfCoffees * 100;

        //assignment operator
        caffeineIntake += 10; //incrementing caffeine intake by 10

        System.out.println("Do you prefer Hot or Cold coffee? C = Cold, H = Hot");
        char coffeeType = scanner.next().charAt(0);

        //relational operator
        boolean isHotCoffee = (coffeeType =='H');
        boolean isColdBrew =  (coffeeType =='C');

        System.out.println("Are you drinking decaf? (Please enter True or False)");
        isDecaf = scanner.nextBoolean();

        //logical operator
        boolean isCaffeinated = !isDecaf && !isHotCoffee;

        System.out.println("About how much on average do you spend on coffee monthly?: ");
        coffeeCost = scanner.nextFloat();

        System.out.println("Please enter the number of coffee beans used: (Make a guess here)");
        coffeeBeans = scanner.nextLong();

        //bitwise op
        long doubledCoffeeBeans = coffeeBeans <<1; //doubles the coffee beans

        System.out.println("How many cups of coffee creamer do you use when making coffee?: ");
        coffeeCreamer = scanner.nextByte();

        //output
        System.out.println("Here's your morning routine: ");

        System.out.println("Wake UP!!!!!!");
        System.out.println("Now Brush your teeth");
        System.out.println("Stretch for 15 minutes!");

        System.out.println("Now let's work on calculating your caffeine intake.....");
        System.out.println("Your preferred coffee type is: " + coffeeType);
        System.out.printf("You spend a total of: $%.2f on coffee%n" , coffeeCost);
        System.out.println("That's a total of " + coffeeBeans + " being used.");
        System.out.println("Number of coffee beans doubled is: " + doubledCoffeeBeans);
        System.out.println("If you drink " + numberOfCoffees + " cups a day, you'll be using " + coffeeCreamer + " cups of creamer.");


        if (isHotCoffee){
            System.out.println("Time for a nice hot cup of coffee");
        } else {
            System.out.println("Let's enjoy some cold brew");
        }

        if (isCaffeinated){
            System.out.println("Your caffeine intake is: " + caffeineIntake + " mg");
            System.out.println("Let's have a smoothie instead");
            System.out.println("Would you like strawberry and banana or watermelon and pineapple?");
            String smoothieChoice = scanner.next();
            System.out.println("You chose to have a " + smoothieChoice + " smoothie today.");

            System.out.println("Have some scrambled eggs");
        } else if (isColdBrew){
            System.out.println("Your caffeine intake is: " + caffeineIntake + " mg");
            System.out.println("Have a vanilla chai");
            System.out.println("Enjoy an omelet with tomatoes and spinach");
        }

        System.out.println("Enjoy your day!");
        scanner.close();




    }
}
