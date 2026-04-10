import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

    String[] sort(String[] arr) {
        String[] a = arr.clone();
        Arrays.sort(a);
        return a;
    }

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    void testSort_UnsortedInput() {
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair","First Class","General"};
        assertArrayEquals(input, sort(input));
    }
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TrainConsistManagementAppTest {

        boolean search(String[] arr, String key) {
            for (String id : arr) {
                if (id.equals(key)) {
                    return true;
                }
            }
            return false;
        }

        @Test
        void testSearch_BogieFound() {
            String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
            assertTrue(search(arr, "BG309"));
        }

        @Test
        void testSearch_BogieNotFound() {
            String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
            assertFalse(search(arr, "BG999"));
        }

        @Test
        void testSearch_FirstElementMatch() {
            String[] arr = {"BG101","BG205","BG309"};
            assertTrue(search(arr, "BG101"));
        }

        @Test
        void testSearch_LastElementMatch() {
            String[] arr = {"BG101","BG205","BG550"};
            assertTrue(search(arr, "BG550"));
        }

        @Test
        void testSearch_SingleElementArray() {
            String[] arr = {"BG101"};
            assertTrue(search(arr, "BG101"));
        }
    }
    @Test
    void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};
        assertArrayEquals(expected, sort(input));
    }

    @Test
    void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};
        assertArrayEquals(input, sort(input));
    }
}