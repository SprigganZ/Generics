package kz.marlen;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
