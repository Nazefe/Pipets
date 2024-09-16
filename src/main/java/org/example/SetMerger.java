package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetMerger {
    public Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> mergedSet = new HashSet<>(set1);
        mergedSet.addAll(set2);
        return mergedSet;
    }
}
