import org.example.SetDifferenceCalculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetDifferenceCalculatorTest {

    @Test
    public void testCalculateDifference() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        Set<Integer> result = calculator.calculateDifference(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));

        assertEquals(expected, result);
    }

    @Test
    public void testCalculateDifferenceEmptySets() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> result = calculator.calculateDifference(set1, set2);
        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, result);
    }

    @Test
    public void testCalculateDifferenceNoDifference() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        Set<Integer> result = calculator.calculateDifference(set1, set2);
        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, result);
    }

    @Test
    public void testCalculateDifferenceSet1IsSubsetOfSet2() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        Set<Integer> result = calculator.calculateDifference(set1, set2);
        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, result);
    }
}
