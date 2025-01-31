public class Dealership {
    public static void main(String[] args) {
        
    }
    private Car[] cars;

    // Constructor
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]); // Deep copy
        }
    }

    // Getter for car (returns a deep copy)
    public Car getCar(int index) {
        return new Car(this.cars[index]); // Return a deep copy
    }

    // Setter for car (assigns a deep copy)
    public void setCar(int index, Car car) {
        this.cars[index] = new Car(car);
    }
}
