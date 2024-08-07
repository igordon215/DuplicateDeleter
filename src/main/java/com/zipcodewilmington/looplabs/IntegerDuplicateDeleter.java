package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */

// * Given an object, `StringDuplicateDeleter`, with a composite `String[]` object, write a method
//        * `removeDuplicatesExactly` which removes all values in the array which occur exactly the specified number of times.
//        * `removeDuplicates` which removes all values in the array which occur at least the specified number of times.


public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] removed = new Integer[0];
        for (Integer element : this.array) {
            if (getNumberOfOccurrences(element) < maxNumberOfDuplications) {
                int i = removed.length;
                removed = Arrays.copyOf(removed, i + 1);
                removed[i] = element;
            }
        }
        return removed;
    }

    public Integer getNumberOfOccurrences(int valueToEvaluate) {
        int counter = 0;
        for (int element : array) {
            if (element == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
