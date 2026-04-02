import java.util.*;
import java.util.stream.*;

// Same class reused
class TrainConsistManagementApp {
    private int id;
    private int capacity;

    // Constructor
    public TrainConsistManagementApp(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Getter
    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        // Reusing bogie list
        List<TrainConsistManagementApp> bogieList = Arrays.asList(
                new TrainConsistManagementApp(1, 50),
                new TrainConsistManagementApp(2, 80),
                new TrainConsistManagementApp(3, 65),
                new TrainConsistManagementApp(4, 40)
        );

        // Stream pipeline: map + reduce
        int totalCapacity = bogieList.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}