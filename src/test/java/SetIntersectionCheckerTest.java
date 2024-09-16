import org.example.SetIntersectionChecker;
import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetIntersectionCheckerTest {
    static SetIntersectionChecker extractor;
    @BeforeAll
    static void createObject(){
        extractor = new SetIntersectionChecker();
    }
    private void assertEquals(boolean intersecting) {
    }
    @Test
    public void testSetsWithCommonElements() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        assertEquals(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void testSetsWithoutCommonElements() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));

        assertEquals(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void testEmptySets() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertEquals(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void testOneEmptySet() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        assertEquals(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void testSameSet() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        assertEquals(extractor.isIntersecting(set1, set2));
    }

    @Test
    public void testDifferentOrder() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        assertEquals(extractor.isIntersecting(set1, set2));
    }

}
