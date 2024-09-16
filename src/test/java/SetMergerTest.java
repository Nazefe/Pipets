import org.example.SetMerger;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetMergerTest {

    @Test
    public void testMergeSets_NonOverlappingSets() {
        SetMerger setMerger = new SetMerger();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        Set<Integer> result = setMerger.mergeSets(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        assertEquals(expected, result);
    }

    @Test
    public void testMergeSets_OverlappingSets() {
        SetMerger setMerger = new SetMerger();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> result = setMerger.mergeSets(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expected, result);
    }

    @Test
    public void testMergeSets_EmptySets() {
        SetMerger setMerger = new SetMerger();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> result = setMerger.mergeSets(set1, set2);
        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, result);
    }
}
