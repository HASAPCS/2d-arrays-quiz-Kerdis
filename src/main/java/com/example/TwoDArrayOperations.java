package com.example;

public class TwoDArrayOperations {

    // Exercise 1: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        // TODO: Implement the logic to check if the 2D array contains the specified value.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == value) {
                    return true;
                }
            }
        }
        return false; // Placeholder return value
    }

    // Exercise 2: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
        int count = 0;
        int sum = 0; 

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                count++;
                }
            }
        return sum/count; // Placeholder return value
    }

    // Exercise 3: Find the Minimum Value in a 2D Array
    public static int findMinimumValue(int[][] array) {
        // TODO: Implement the logic to find the minimum value in the 2D array.
        int num = 0; 

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (num < array[i][j]) {
                    num = array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (num > array[i][j]) {
                    num = array[i][j];
                }
            }
        }
        return num; // Placeholder return value
    }
}
