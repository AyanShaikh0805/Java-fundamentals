public class LogicalOperators {
    public static void main(String[] args) {

        boolean hasDrivingLicense = true, hasInsurance = true;
        System.out.println(hasDrivingLicense && hasInsurance ? "You can legally drive." : "You cannot legally drive.");

        int age = 25;
        double income = 45000;
        System.out.println(age >= 21 && income >= 40000 ? "You are eligible for a loan." : "You are not eligible for a loan.");

        String inputUsername = "JohnDoe", inputPassword = "password123";
        System.out.println(inputUsername.equals("JohnDoe") && inputPassword.equals("password123") ? "Access granted!" : "Invalid username or password");

        boolean hasGoodPerformance = true, isLongTermEmployee = false;
        System.out.println(hasGoodPerformance || isLongTermEmployee ? "The user is eligible for a promotion." : "The user is not eligible for a promotion.");

        int userAge = 17;
        boolean isParentPresent = true;
        System.out.println(userAge >= 18 || isParentPresent ? "You can enter the venue." : "You cannot enter the venue.");

        int memberAge = 16;
        boolean hasMembership = false;
        System.out.println(memberAge >= 18 || hasMembership ? "The user can access the service." : "The user cannot access the service.");

        String option = "cash";
        boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        System.out.println(!cashOrCredit ? "Please choose another payment option" : "Sold. Pleasure doing business with you!");

        char letter = 'A';
        boolean isVowel = "AEIOU".indexOf(letter) != -1;
        System.out.println(!isVowel ? "The letter " + letter + " is a consonant" : "The letter " + letter + " is a vowel");

        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        System.out.println(!isHitOrStay ? "Please choose a valid move" : "You win 10 bucks!");
    }
}
