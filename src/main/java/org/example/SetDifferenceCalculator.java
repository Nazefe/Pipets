package org.example;


import java.util.HashSet;
import java.util.Set;

public class SetDifferenceCalculator {

    public Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.removeAll(set2);
        return resultSet;
    }
}