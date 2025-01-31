public class ForLoopExamples {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world!");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
