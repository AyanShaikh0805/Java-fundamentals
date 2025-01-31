public class Car {
    public static void main(String[] args) {
        
    }
    private String make;
    private int price;
    private int year;
    private String color;
    private String[] parts;

    // Constructor
    public Car(String make, int price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts.clone(); // Ensure deep copy of array
    }

    // Copy Constructor (Deep Copy)
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts.clone(); // Deep copy of array
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        return parts.clone(); // Return a deep copy
    }

    public void setParts(String[] parts) {
        this.parts = parts.clone();
    }
}

