package com.amitkrg.parctice.simple;

import java.util.Scanner;

/**
 * Problem: Given two numbers 'a' and 'b', find 'a' + 'b'
 * <p>
 * Constraints: 0 <= 'a', 'b' <= 9
 * <p>
 * Author: amit024003
 * Start Date: 08/27/2016
 * Last Modified: 08/27/2016
 */
public class APlusB {
    public static void main(String[] args) {
        // Read the input from input stream.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        // Print the result.
        System.out.println(a + b);
    }
}

