package org.example;

public class Number {

    public int average(int number) {
        int numberOfDigits = String.valueOf(number).length();

        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }


        return sum / numberOfDigits;

    }
}
