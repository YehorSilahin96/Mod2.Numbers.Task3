package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        String inputNumber = sc.nextLine();

        int length = inputNumber.length();
        int counter = 0;
        char digit;

        for (int i = 1; i < length; i++) {
            digit = inputNumber.charAt(i);
            if (digit == '0') {
                counter++;
            }
        }

        char first = inputNumber.charAt(0);

        if (counter > 0 && first != '0') {
            System.out.println("It's a duck number");
        }
        else {
            System.out.println("Not a duck number");
        }
    }
}