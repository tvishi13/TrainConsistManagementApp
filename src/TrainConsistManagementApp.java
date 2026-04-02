import java.util.*;

// 🔴 Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🚆 Bogie Class with Validation
class TrainConsistManagementApp {
    private int id;
    private int capacity;

    // Constructor with validation
    public TrainConsistManagementApp(int id, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.id = id;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        List<TrainConsistManagementApp> bogieList = new ArrayList<>();

        try {
            // Valid bogie
            bogieList.add(new TrainConsistManagementApp(1, 50));

            // Invalid bogie (will throw exception ❌)
            bogieList.add(new TrainConsistManagementApp(2, -10));

        } catch (InvalidCapacityException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nValid Bogies in Train:");
        for (TrainConsistManagementApp b : bogieList) {
            System.out.println(b);
        }
    }
}