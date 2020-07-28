package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class SocketMerchant {

    static int sockMerchant(int n, int[] ar) {

        List<Integer> list = Arrays.stream(ar).boxed().sorted().collect(Collectors.toList());
        Map<Integer, Integer> colors = new HashMap<>();
        int pairs = 0;

        for(Integer color : list){
            if(!colors.containsKey(color)) {
                colors.put(color, Collections.frequency(list, color));
            }
        }

        for (Integer value: colors.values()) {
            if(!isOdd(value)){
                pairs += value/2;
            }

            if(value > 1 && isOdd(value)){
                pairs += (value -1)/2;
            }
        }

        return pairs;
    }

    static boolean isOdd(int value){
        return value % 2 != 0;
    }


}



