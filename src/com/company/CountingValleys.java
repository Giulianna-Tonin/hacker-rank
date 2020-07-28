package com.company;

import java.util.ArrayList;
import java.util.List;

public class CountingValleys {

    static int countingValleys(int n, String s) {

    List<Integer> path = new ArrayList<>();
    path.add(0);
    int count = 0;
    int deepToValey = 0;
    int backInSeaLevel = 0;

    for(char step: s.toCharArray()){
        if(step == 'U'){
            path.add(++count);
        } else {
            path.add(--count);
        }
    }

    for(int i = 1; i < path.size(); i++){
        if((path.get(i-1) == 0) && (path.get(i) == -1)){
            deepToValey ++;
        }

        if((path.get(i) == -1) && (path.get(i+1) == 0)){
            backInSeaLevel ++;
        }
    }
        return (deepToValey + backInSeaLevel)/2;

    }

}
