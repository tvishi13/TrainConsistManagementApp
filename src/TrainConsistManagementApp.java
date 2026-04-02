import java.util.*;
import java.util.stream.*;

// Your required class name
class TrainConsistManagementApp {
    private int id;
    private int capacity;

    // Constructor (must match class name ✅)
    public TrainConsistManagementApp(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        // List uses your class name
        List<TrainConsistManagementApp> bogieList = new ArrayList<>();

        bogieList.add(new TrainConsistManagementApp(1, 50));
        bogieList.add(new TrainConsistManagementApp(2, 80));
        bogieList.add(new TrainConsistManagementApp(3, 65));
        bogieList.add(new TrainConsistManagementApp(4, 40));

        // Stream filtering
        List<TrainConsistManagementApp> filteredList = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display output
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (TrainConsistManagementApp b : filteredList) {
            System.out.println(b);
        }
    }
}