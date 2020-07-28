package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepeatedString {



    static long repeatedString(String s, long n) {

        int qtddA = 0;
        List<Character> list = new ArrayList<>();

        for(char c: s.toCharArray() ){
            if(c=='a'){
                qtddA++;
            }
        }

        if(qtddA == 0){
            return 0;
        }

        if(n%s.length() == 0){
            return (n/s.length())*qtddA;
        } else {

            long number = (n / s.length()) * s.length();
            long rest = n - number;

            int i =0;

            while (i < rest){
                for(char c: s.toCharArray()){
                    if(list.size() < rest) {
                        list.add(c);
                    }
                }
                i += s.length();
            }

            return Collections.frequency(list, 'a') + ((n/s.length()) * qtddA);
        }
    }

}
