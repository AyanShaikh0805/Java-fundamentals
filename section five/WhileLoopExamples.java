public class WhileLoopExamples {

    public static void main(String[] args) {
        int roll;

        roll = rollDice();
        while (roll != 6) {
            roll = rollDice();
        }

        int randomNumber = generateRandomNumber();
        while (randomNumber <= 90) {
            randomNumber = generateRandomNumber();
        }

        int number = generateRandomNumber();
        while (number <= 1000) {
            number *= 2;
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
