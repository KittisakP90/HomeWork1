/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kittiporn.homework1;

import java.util.Scanner;

/**
 *
 * @author Best
 */
public class FindMaxandSortting {

    public static void main(String[] args) {
        int n, a, d, swap, number, max = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Plese Input number of integers");
        n = scan.nextInt();

        int[] array = new int[n];
        System.out.println("Plese Input " + n + " integers");

        for (a = 0; a < n; a++) {
            array[a] = scan.nextInt();
        }

        for (a = 0; a < (n - 1); a++) {
            for (d = 0; d < n - a - 1; d++) {
                if (array[d] > array[d + 1]) {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                    number = a + 1;
                }
            }
        }
        System.out.println("Bubbel Sort");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
            max = array[i];
        }
        System.out.println("Max values : " + max);
    }

}
