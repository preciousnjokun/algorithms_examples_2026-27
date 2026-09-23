package utils;

public class ArrayUtils {

    /*
    Input: numbers (array of ints)
    Output: each value in the array and its position

    For each position in numbers:
        Display the position
        Display the value at that position
    */


    public static void displayArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Position " + i + ": " + numbers[i]);
        }
    }
}