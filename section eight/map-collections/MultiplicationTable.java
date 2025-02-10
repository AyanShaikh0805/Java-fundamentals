import java.util.TreeMap;
import java.util.Map;

public class MultiplicationTable {
    public static void main(String[] args) {
        Map<Integer, Integer> tree = new TreeMap<>();

        int multiplier = 5;
    
        for (int i = 1; i <= 10; i++) {
            tree.put(i, multiplier * i);
        }
        System.out.println("\nWhat is 4 multiplied by " + multiplier + "?");
        System.out.println(tree.get(4));

        System.out.println("\nWhat is 7 multiplied by " + multiplier + "?");
        System.out.println(tree.get(7));

        System.out.println("\nWhat is 3 multiplied by " + multiplier + "?");
        System.out.println(tree.get(3));

        System.out.println("\nDoes the table reach 20?");
        String response = tree.containsKey(20) ? "Yes!" : "No, sorry!";
        System.out.println(response);
    }
}
