package com.company;

public class ReverseInteger {

    public static void main(String[] args) {

        int num=123456, reminder, reverse=0;
        while(num !=0)
        {
            reminder = num%10;
            reverse = reverse *10 + reminder;
            num = num/10;

        }
        System.out.println(reverse);
    }
}

