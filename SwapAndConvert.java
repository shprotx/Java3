package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapAndConvert {
    public static void main(String[] args) {
        String[] words = {"aaaaaa", "bbbbbbb", "cccc"};
        swapElements(words, 0, 2);
        convertToArrayList(words);
    }

    private static void swapElements(Object[] array, int a, int b) {
        try {
            Object temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    private static <T> ArrayList convertToArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
