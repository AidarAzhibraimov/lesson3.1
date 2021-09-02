package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbs = {12, 3, 4, 5, -6, 7, 17, -8, 9, 0, -19, 32, 2, -3.1, 4};
        boolean isMinus = false;
        double newValue = 0;
        int count = 0;

        for (double num : numbs) {

            if (num < 0) {
                isMinus = true;
            }

            if (isMinus) {
                if (num > 0) {
                    count++;
                    newValue += num;
                }
            }
        }

        System.out.println("Среднее арифметическое = " + newValue/count);
    }
}