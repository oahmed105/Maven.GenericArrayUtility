package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {

    private T[] objArray;

    public ArrayUtility(T[] type) {
        this.objArray = Arrays.copyOf(type, type.length);
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer num = 0;
        for(T i: objArray){
            if(i.equals(valueToEvaluate)){
                num += 1;
            }
        }
        return num;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return null;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }


//    public ArrayUtility(Class<T> c, int length) {
//        objArray = (T[]) Array.newInstance(c, length);
//        this.length = length;
//    }

//    public T get(int i) {
//        return objArray[i];
//    }
//
//    public void set(int i, T t) {
//        this.objArray = Arrays.copyOf(type, type.length);
//    }

//    @Override
//    public String toString() {
//        return Arrays.toString(objArray);
//    }
}
