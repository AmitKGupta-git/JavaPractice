package com.amitkrg.parctice.simple;

import java.util.Scanner;

/**
 * Author: amit024003
 * Created on: 9/02/16
 * Last Modified on: 9/02/16
 */
public class Fibonacci {

    public static long FibList(n) {
        long fibNum[] = new long[n + 1];
        fibNum[0] = 0;
        fibNum[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
        }
    }

    public static long FibRecurs(n) {
        if (n <= 1)
            return n;
        else
            return FibRecurs(n - 1) + FibRecurs(n - 2);
    }

    public static void main(Stirng[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(FibRecurs(n));
        System.out.println(FibList(n));
    }
}
