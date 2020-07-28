package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSwaps2 {

    //4 3 1 2

    //1, 3, 5, 2, 4, 6, 7

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> ordenedList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        getSwaps(swaps, list, ordenedList);
        return swaps;
    }

    private static int getSwaps(int swaps, List<Integer> list, List<Integer> ordenedList) {
        int change = 0;
        for (int i = 0; i < list.size() -1; i++) {
            int atual = list.get(i);
            int next = list.get(i+1);

                if (atual > next) {
                    list.set(i, next);
                    list.set(i+1, atual);
                    change++;
                }
            }

        swaps += change;

        if(!list.equals(ordenedList)){
           getSwaps(swaps, list, ordenedList);
        }

        return swaps;


    }

}
