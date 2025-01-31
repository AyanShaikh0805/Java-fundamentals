public class Scope {
    
    // Global variables to store the rectangle's length and width (accessible within the whole class)
    static double length = 2;
    static double width = 4;

    public static void main(String[] args) {
        // Call the methods that use global variables directly
        calculateArea();
        calculatePerimeter();
        
        // Alternatively, you can still use local variables for specific cases
        double localLength = 5;
        double localWidth = 3;
        calculateArea(localLength, localWidth);
        calculatePerimeter(localLength, localWidth);
    }

    // Using global variables for area calculation
    public static void calculateArea() {
        double area = length * width; // Using global variables
        System.out.println("Area of the rectangle: " + area);
    }

    // Using global variables for perimeter calculation
    public static void calculatePerimeter() {
        double perimeter = 2 * (length + width); // Using global variables
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Using parameters for a different set of values
    public static void calculateArea(double param1, double param2) {
        double area = param1 * param2; // Using local parameters
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter(double param1, double param2) {
        double perimeter = 2 * (param1 + param2); // Using local parameters
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
