public class SwitchStatements {
    public static void main(String[] args) {

        // Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny" -> System.out.println("Wear sunglasses and a t-shirt.");
            case "cloudy" -> System.out.println("A light jacket should be fine.");
            case "rainy" -> System.out.println("Take an umbrella.");
            case "snowy" -> System.out.println("Wear a coat and boots.");
            default -> System.out.println("Check the forecast!");
        }

        // User role
        int role = 2;
        switch (role) {
            case 1 -> System.out.println("Admin access granted.");
            case 2 -> System.out.println("Editor access granted.");
            case 3 -> System.out.println("User access granted.");
            default -> System.out.println("Unknown role.");
        }

        // Temperature and humidity
        int temperature = 75, humidity = 65;
        if (temperature > 80 && humidity > 70) {
            System.out.println("It's too hot and humid!");
        } else if (temperature < 60) {
            System.out.println("It's too cold.");
        } else {
            System.out.println("The weather is comfortable.");
        }

        // Age and income (Credit Card Eligibility)
        int age = 25, income = 50000;
        if (age >= 21 && income >= 40000) {
            System.out.println("You are eligible for the credit card.");
        } else {
            System.out.println("You are not eligible.");
        }

        // Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green" -> System.out.println("Go.");
            case "yellow" -> System.out.println("Slow down.");
            case "red" -> System.out.println("Stop.");
            default -> System.out.println("Invalid light color.");
        }

        // Exam grade
        int grade = 85;
        switch (grade / 10) {
            case 10, 9 -> System.out.println("You got an A!");
            case 8 -> System.out.println("You got a B.");
            case 7 -> System.out.println("You got a C.");
            case 6 -> System.out.println("You got a D.");
            default -> System.out.println("You got an F.");
        }

        // Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Chrome", "Firefox", "Safari", "Edge", "Opera" -> System.out.println("Supported browser.");
            default -> System.out.println("Browser not supported.");
        }
    }
}
