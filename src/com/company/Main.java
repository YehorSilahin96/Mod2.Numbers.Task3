package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //input

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        String str = sc.nextLine();

        int length = str.length();
        int counter = 0;
        char chr;

        for(int i=1;i<length;i++)
        {
            chr = str.charAt(i);
            if(chr=='0')
                counter++;
        }

        char first = str.charAt(0);

        if(counter>0 && first !='0')
            System.out.println("Duck number");

        else
            System.out.println("Not a duck number");

    }
}
