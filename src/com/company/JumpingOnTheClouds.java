package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        List<Integer> clouds = Arrays.stream(c).boxed().collect(Collectors.toList());
        List<Integer> zeroJumps = new ArrayList<>();
        int zeros = 0;
        int minJumps = 0;

        for(Integer cloud : clouds){
            if(cloud == 0){
              zeros++;
            } else {
                zeroJumps.add(zeros);
                zeros = 0;
            }
        }

        zeroJumps.add(zeros);

        for (Integer jump: zeroJumps){

            if(jump%2 == 0){
                minJumps += jump/2;
            }

            if(jump%2 != 0){
                minJumps += ((jump-1)/2);
            }
        }
        return minJumps + Collections.frequency(clouds, 1);

    }


}
