public class BuiltInFunctions {

    public static void main(String[] args) {

        String message = "Hello, World!";
        System.out.println(message);

        String example = "Java";
        int length = example.length();
        System.out.println("Length of the string: " + length);

        String upperCase = "JAVA";
        String lowerCase = upperCase.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        String programming = "Java programming";
        boolean startsWithPrefix = programming.startsWith("Java");
        System.out.println("Starts with 'Java': " + startsWithPrefix);

        String original = "Java is fun!";
        String replacedString = original.replace('a', 'o');
        System.out.println("Replaced string: " + replacedString);

        double number = 9;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root: " + squareRoot);

        double base = 2;
        double exponent = 3;
        double power = Math.pow(base, exponent);
        System.out.println("Power: " + power);

        double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber);

        int number1 = 5;
        int number2 = 10;
        int maxNumber = Math.max(number1, number2);
        System.out.println("Larger number: " + maxNumber);
    }
}
