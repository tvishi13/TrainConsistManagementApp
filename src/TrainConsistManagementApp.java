import java.util.*;
import java.util.stream.*;

// Same class reused
class TrainConsistManagementApp {
    private int id;
    private int capacity;

    public TrainConsistManagementApp(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create large dataset for better measurement
        List<TrainConsistManagementApp> bogieList = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            bogieList.add(new TrainConsistManagementApp(i, (i % 100) + 30));
        }

        // 🔹 Loop-based filtering
        long startLoop = System.nanoTime();

        List<TrainConsistManagementApp> loopResult = new ArrayList<>();
        for (TrainConsistManagementApp b : bogieList) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 Stream-based filtering
        long startStream = System.nanoTime();

        List<TrainConsistManagementApp> streamResult = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Display results
        System.out.println("Loop Time (nanoseconds): " + loopTime);
        System.out.println("Stream Time (nanoseconds): " + streamTime);
    }
}