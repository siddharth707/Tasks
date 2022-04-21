package com.company;

public class Palindrome {

    public static void main(String[] args) {
        int n=121;
        // saving n value in temp files
        int temp=n;
        // if reverse is 0,
        int rev=0, reminder;
        while (temp!=0)
        {
            reminder=temp%10;
            rev=rev*10+reminder;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.println(n+"is palidrome");
        }
        else
        {
            System.out.println(n+"is not palidrome");
        }
    }
}

