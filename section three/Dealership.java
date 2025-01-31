import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        /******************Part 1******************/
        if (option.equals("a")) {
            System.out.println("You chose option 'a' to buy a car.");
            System.out.println("What is your budget?");
            int budget = scan.nextInt();

            // Check if budget is sufficient
            if (budget >= 10000) {
                System.out.println("Great! A Nissan Altima is available.");
                scan.nextLine(); // Consume the newline character

                System.out.println("Do you have insurance? Write 'yes' or 'no'");
                String insurance = scan.nextLine();
                System.out.println("Do you have a license? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("What is your credit score?");
                int creditScore = scan.nextInt();

                // Check if they meet the requirements
                if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                    System.out.println("Sold! Pleasure doing business with you.");
                } else {
                    System.out.println("We're sorry. You are not eligible.");
                }
            } else {
                System.out.println("We're sorry. You are not eligible due to insufficient budget.");
            }
        } else if (option.equals("b")) {
            System.out.println("You chose option 'b' to sell a car.");
            System.out.println("What is your car valued at?");
            int value = scan.nextInt();
            System.out.println("What is your selling price?");
            int price = scan.nextInt();

            // Check if the car value is greater than the selling price
            if (value > price && price < 30000) {
                System.out.println("We will buy your car. Pleasure doing business with you!");
            } else {
                System.out.println("Sorry, we're not interested.");
            }
        } else {
            System.out.println("Invalid option: " + option);
        }

        scan.close();
    }
}