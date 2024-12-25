package org.algorithms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(factorialIterative(number));
        System.out.println(factorialRecursive(number));
    }

    public static int factorialIterative(int n) {
        int factorial = 1;
        for (; n > 1; n--) {
            factorial *= n;
        }
        return factorial;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) return 1;
        return n * factorialRecursive(n - 1);
    }
}
