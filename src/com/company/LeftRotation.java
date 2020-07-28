package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        int[] b = new int[a.length];
        int atual = 0;

        for(int i = 0; i < d; i++){
            list.add(list.get(atual));
            list.remove(list.get(atual));
        }

        for(int i = 0; i < b.length; i++){
            b[i] = list.get(i);
        }

        return b;
    }





}
