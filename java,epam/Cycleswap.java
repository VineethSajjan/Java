
//package com.epam.rd.autotasks;

import java.util.*;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length == 0 || array == null) return;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        int last = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        list.add(0, last);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length == 0 || array == null) return;
        if (shift == 0 || shift == array.length) return;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 0; i < shift; i++) {
            int last = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, last);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }
}