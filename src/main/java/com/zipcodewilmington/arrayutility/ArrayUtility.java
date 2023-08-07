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
        Object[] hold = new Object[objArray.length + arrayToMerge.length];
        Integer i = 0;
            for (int j = 0; j < objArray.length; j++){
                hold[i] = objArray[j];
                i++;
        }
            for (int j = 0; j < arrayToMerge.length; j++){
                hold[i] = arrayToMerge[j];
                i++;
            }
            for (int j = 0; j < hold.length; j++){
                getNumberOfOccurrences((T) hold[j]);
            }

         return (T) hold[0];
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
