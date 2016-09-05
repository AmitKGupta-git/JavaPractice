package com.amitkrg.parctice.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Problem: Given a sequence of non-negative integers a0,…,an−1, find
 * the maximum pairwise product, that is, the largest integer that can
 * be obtained by multiplying two different elements from the sequence
 * (or, more formally, max0≤i≠j≤n−1 aiaj). Different elements here mean
 * ai and aj with i≠j (it can be the case that ai=aj).
 * <p>
 * Objective:
 * - Read the input stream better way.
 * - Solve problem.
 * - Check the edge cases.
 * <p>
 * Author: amit024003
 * Created on: 8/28/16
 * Last Modified on: 8/28/16
 */
public class MaxPairwiseProduct {

    public static long getMaxPairwiseProduct(int[] numbers) {
        long result = Long.MIN_VALUE;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((long) numbers[i] * (long) numbers[j] > result) {
                    result = (long) numbers[i] * (long) numbers[j];
                }
            }
        }
        return result;
    }

    public static long getMaxPairwiseProductFast(int[] numbers) {
        int n = numbers.length;
        int first_index = -1;
        for (int i = 0; i < n; i++) {
            if (first_index == -1 || numbers[i] > numbers[first_index]) {
                first_index = i;
            }
        }
        int second_index = -1;
        for (int i = 0; i < n; i++) {
            if ((second_index == -1 || numbers[i] > numbers[second_index]) && i != first_index) {
                second_index = i;
            }
        }
        System.out.println(numbers[first_index] + "\t" + numbers[second_index]);
        return (long) numbers[first_index] * (long) numbers[second_index];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));
    }


    // Fast scanner class
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream is) {
            try {
                br = new BufferedReader(new InputStreamReader(is));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Method to provide next token from input stream.
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        // Method to provide next integer token
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
