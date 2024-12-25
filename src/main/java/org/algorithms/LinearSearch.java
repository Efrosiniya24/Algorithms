package org.algorithms;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        Integer [] numbers = { 5,7,2,6,3,1,875,452,23,2461,65,23,11};
        int num = 243;

        System.out.println(search(numbers, num));
        System.out.println(Arrays.asList(numbers).contains(num));
        System.out.println(Arrays.stream(numbers).anyMatch(x -> x == num));
    }

    private static boolean search(Integer[] numbers, int num) {
        for (int number:numbers)
            if(number == num)
                return true;
        return false;
    }
}
