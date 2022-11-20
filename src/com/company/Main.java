package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("final sum is " + getEvenDigitSum(252));
        System.out.println("final sum is " + getEvenDigitSum(-22));
        System.out.println("final sum is " + getEvenDigitSum(111));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenSum = 0;
        while (number > 1) {
            if (number % 2 == 0) {
                evenSum += number % 10;
            }
            number /= 10;
        }
        return evenSum;
    }
}
