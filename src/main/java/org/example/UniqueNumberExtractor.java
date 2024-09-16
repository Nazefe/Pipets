package org.example;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberExtractor {
    public Set<Integer> extractUniqueNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        return uniqueNumbers;
    }
}