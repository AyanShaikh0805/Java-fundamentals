public class Boolean {
    
        public static void main(String[] args) {
            // Boolean variables
            boolean isSunny = true;
            boolean isRaining = false;
    
            // Using Boolean in a condition
            if (isSunny) {
                System.out.println("It's a sunny day! 😎");
            } else {
                System.out.println("It's not sunny.");
            }
    
            // Boolean operations
            System.out.println("Is it both sunny and raining? " + (isSunny && isRaining));
            System.out.println("Is it either sunny or raining? " + (isSunny || isRaining));
            System.out.println("Is it not sunny? " + !isSunny);
        }
    }
    

