package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArr = new String[0];

        for (String x : array){
            if(getNumberOfOccurrencesString(x) != exactNumberOfDuplications){
                int index = newArr.length;
                newArr = Arrays.copyOf(newArr,index+1);
                newArr[index] = x;
            }
        }
        return newArr;

    }

    public int getNumberOfOccurrencesString(String valueToEvaluate) {
        int counter = 0;
        for (String element : array){
            if (element.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

}
