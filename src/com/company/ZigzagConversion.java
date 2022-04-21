package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
    }

    public String convert(String s, int numRows) {

        if (numRows ==1) return s;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i <Math.min(numRows, s.length()); i++)

            rows.add(new StringBuilder());

        int curRow = 0;
        return s;

    }
}

