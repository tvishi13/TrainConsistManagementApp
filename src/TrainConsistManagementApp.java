import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies (end by default)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Final output
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        System.out.println("\nProgram continues...");
    }
}