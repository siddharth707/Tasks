package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomantoIntegers {
    public static void main(String[] args) {
    }
    public int romanToInt(String s) {

        if (s == null || s.length()==0) {

            Map<Character, Integer> charMap= new HashMap<>();
            charMap.put('I', 1);
            charMap.put('V', 5);
            charMap.put('X', 10);
            charMap.put('L', 50);
            charMap.put('C', 100);

            int result=0;

            for (int i = 1; i < s.length()-1; i++) {
                if (charMap.get(s.charAt(i)) >= charMap.get(s.charAt(i+1))) {
                    result = result + charMap.get(s.charAt(i));
                }
                else {
                    result=result-charMap.get(s.charAt(i));
                }
            }
            result=result+charMap.get(s.charAt(s.length()-1));
            return result;

        }
        //return res;
        return 0;
    }
}
