/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 25, 2020
 * Date last edited: February 26, 2020
 * Program title: Eratosthenes.java
 * This program initializes a boolean array of 1001 booleans to true.
 * For each index i after 1, each index which is a multiple i.
 * The remaining true booleans are printed to the console.
 */
package eratosthenes;

import java.util.Arrays;

public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializing array of booleans, all are true
        boolean numbers[] = new boolean[1001];
        Arrays.fill(numbers, true);

        // Setting indexes 0 and 1 to false
        numbers[0] = numbers[1] = false;
        for (int i = 2; i <= 1000; i++) {
            if (numbers[i]) {
                // Setting all indexes of multiplies of i to false
                for (int j = i * i; j < numbers.length; j += i) {
                    numbers[j] = false;
                }
            }
        }

        // Outputting
        System.out.print("The prime numbers from 1 - 1000 are:\n");

        // Initializing count for number 
        int count = 1;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] && count % 10 != 0) {
                System.out.print(i + " ");
                count++;
            } else if (numbers[i] && count % 10 == 0) {
                System.out.print(i + "\n");
                count++;
            }
        }

    }

}
