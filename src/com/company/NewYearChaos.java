package com.company;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {


    //1 2 3 4 5 6 7 8
    //1 2 3 4 5 6 8 7
    //1 2 3 4 5 8 6 7


    // 1 2 3 4 5 6 7 8
    // 1 2 3 5 4 6 7 8            5 1
    // 1 2 5 3 4 6 7 8            5 1
    // 1 2 5 3 4 7 6 8            7 1
    // 1 2 5 3 7 4 6 8            7 1
    // 1 2 5 3 7 4 8 6            8 1
    // 1 2 5 3 7 8 4 6            8 1
    // 1 2 5 3 7 8 6 4            6 1

    // 1 2 5 3 7 8 6 4
    // 1 2 3 4 5 6 7 8


    //se o numero for menor ele não fez nada


    static void minimumBribes(int[] q) {
        int change = 0;
        List<Integer> list = new ArrayList<>();
        int totalJumps = 0;
        Boolean isOk = true;

        for (int i = 0; i < q.length - 1; i++) {

            int position = i + 1;
            int person = q[i];

            if (person > position) {
                change = person - position;
            }

            if(person < position && person > q[i+1]) {
                change = position - person;
            }

            list.add(change);
            change = 0;
        }


        for (Integer jumps:list) {
            if (jumps >= 3) {
              isOk = false;
            } else {
                totalJumps += jumps;
            }

        }

        if(isOk){
            System.out.println(totalJumps);
        } else {
            System.out.println("Too chaotic");
        }


    }

//    private static boolean isOk(Integer jumps){
//        return jumps < 3;
//    }



}

