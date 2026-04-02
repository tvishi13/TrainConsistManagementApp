import java.util.*;
import java.util.stream.*;

// Class representing a goods bogie
class TrainConsistManagementApp {
    private int id;
    private String type;   // e.g., Cylindrical, Box
    private String cargo;  // e.g., Petroleum, Coal

    // Constructor
    public TrainConsistManagementApp(int id, String type, String cargo) {
        this.id = id;
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Type: " + type + ", Cargo: " + cargo;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create list of goods bogies
        List<TrainConsistManagementApp> bogieList = Arrays.asList(
                new TrainConsistManagementApp(1, "Cylindrical", "Petroleum"),
                new TrainConsistManagementApp(2, "Box", "Coal"),
                new TrainConsistManagementApp(3, "Cylindrical", "Petroleum"),
                new TrainConsistManagementApp(4, "Box", "Grain")
        );

        // Safety rule using lambda + allMatch
        boolean isSafe = bogieList.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // other types allowed
                });

        // Display result
        if (isSafe) {
            System.out.println("✅ Train is SAFETY COMPLIANT");
        } else {
            System.out.println("❌ Train is NOT SAFE");
        }
    }
}