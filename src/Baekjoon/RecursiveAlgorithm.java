package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;


public class RecursiveAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(4));


    }

    public static int factorial(int n) {
        int sum = 0;
        if (n==1) return 1;
        else {
            for(int i=1; i<=n; i++) {
                sum += i;

            }
            return factorial(n-1) + sum;
        }

    }
}