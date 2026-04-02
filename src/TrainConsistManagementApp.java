import java.util.*;
import java.util.stream.*;

class TrainConsistManagementApp {
    private int id;
    private int capacity;

    // Constructor (no return type ✅)
    public Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Getter method
    public int getCapacity() {
        return capacity;
    }

    // Display method
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie(1, 50));
        bogieList.add(new Bogie(2, 80));
        bogieList.add(new Bogie(3, 65));
        bogieList.add(new Bogie(4, 40));

        // Filtering bogies with capacity > 60
        List<Bogie> filteredList = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display result
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredList) {
            System.out.println(b);
        }
    }
}