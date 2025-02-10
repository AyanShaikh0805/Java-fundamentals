import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        // Create an ArrayList to store city names
        ArrayList<String> cities = new ArrayList<>();

        // Add cities to the list
        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");

        // Print the size of the ArrayList
        System.out.println("Number of cities: " + cities.size());

        // Access and print specific elements
        System.out.println("City at index 5: " + cities.get(5));
        System.out.println("City at index 8: " + cities.get(8));

        // Update an element
        cities.set(2, "Naples"); // Changing "Venice" to "Naples"

        // Remove an element
        cities.remove(5); // Removes "Petra"

        // Print the updated list
        System.out.println("Updated list of cities: " + cities);
    }
}
