package com.amitkrg.parctice.algo.stress;

import com.amitkrg.parctice.algo.MaxPairwiseProduct;

import java.util.Random;

/**
 * Problem: Given a sequence of non-negative integers a0,…,an−1, find
 * the maximum pairwise product, that is, the largest integer that can
 * be obtained by multiplying two different elements from the sequence
 * (or, more formally, max0≤i≠j≤n−1 aiaj). Different elements here mean
 * ai and aj with i≠j (it can be the case that ai=aj).
 * <p>
 * Objective:
 * - Stress Test for MaxPairwiseProduct
 * <p>
 * Author: amit024003
 * Created on: 8/28/16
 * Last Modified on: 8/28/16
 */
public class MaxPairwiseProductStressTest {

    public static void main(String[] args) {
        Random rand = new Random(10);
        while (true) {
            int n = rand.nextInt(10) % 10 + 2;
            System.out.println(n);
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = rand.nextInt(100000) % 100000;
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            long res1 = MaxPairwiseProduct.getMaxPairwiseProduct(numbers);
            long res2 = MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);

            if (res1 != res2){
                System.out.println("Wrong Answer: " + res1 + " " + res2);
                break;
            }
            else {
                System.out.println("OK");
            }

        }
    }
}
