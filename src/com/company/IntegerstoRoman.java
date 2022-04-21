package com.company;

public class IntegerstoRoman {
    public static void main(String[] args) {
    }
    public String intToRoman(int num) {

        int [] intCode={1000,500,100,50,10,5,1};
        String [] code = {"M", "D", "C", "L", "X", "V","I"};
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i< intCode.length; i++){
            while (num >= intCode[i]) {
                sb.append(code[i]);
                num = intCode[i];
            }}
        return null;
    }
}

