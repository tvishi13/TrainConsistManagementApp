import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B102"); // duplicate
        bogieIds.add("B101"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

        // Check if a specific ID exists
        if (bogieIds.contains("B101")) {
            System.out.println("\nBogie ID B101 exists in the train.");
        }

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}