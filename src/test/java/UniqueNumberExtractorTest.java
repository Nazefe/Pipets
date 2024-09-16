import org.example.UniqueNumberExtractor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class UniqueNumberExtractorTest {
    static UniqueNumberExtractor extractor;
    @BeforeAll
    static void createObject(){
        extractor = new UniqueNumberExtractor();
    }
    @Test
    public void testExtractUniqueNumbersWithDuplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1,2,3,2,4,1,5,3);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
    @Test
    public void testExtractUniqueNumbersEmptyList(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
    @Test
    public void testExtractUniqueNumbersNoDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
    @Test
    public void testExtractUniqueNumbersWithNegativeDuplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(-1,-2,-3,-2,-1,0);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(-1,-2,-3,0));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
    @Test
    public void testExtractUniqueNumbersAllDuplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(2,2,2,2);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(2));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }
}
