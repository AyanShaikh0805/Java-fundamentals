public class Chorus {
    public static void main(String[] args) {
        // Call the singChorus function to repeat the chorus 5 times
        for (int i = 0; i < 5; i++) {
            singChorus();
        }
    }

    // Function to print the chorus
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
}
