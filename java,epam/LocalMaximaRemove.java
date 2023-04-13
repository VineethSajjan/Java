//package com.epam.rd.autotasks.arrays;

import java.util.*;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[500];
        Arrays.fill(array, 0, 100, 150);
        Arrays.fill(array, 100, 200, 50);
        Arrays.fill(array, 200, 300, 15);
        Arrays.fill(array, 300, 400, 55);
        Arrays.fill(array, 400, 500, 500);
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        // put your code here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) continue;
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) continue;
            } else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) continue;
            }
            list.add(array[i]);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}