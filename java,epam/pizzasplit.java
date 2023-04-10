//package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class pizzasplit {
    public static void main(String[] args) {
        // Write a program, reading number of people and number of pieces per pizza and then
        // printing minimum number of pizzas to order to split all the pizzas equally and with no
        // remainder
        Scanner scanner = new Scanner(System.in);
        int numPeople = scanner.nextInt();
        int numSlicesPerPizza = scanner.nextInt();
        int numSlicesNeeded = numPeople * (numSlicesPerPizza / gcd(numPeople, numSlicesPerPizza));
        int numPizzasNeeded = (int) Math.ceil((double) numSlicesNeeded / numSlicesPerPizza);
        System.out.println(numPizzasNeeded);
        scanner.close();
    }

    // Computes the greatest common divisor of two integers using the Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);

        }
    }
}

