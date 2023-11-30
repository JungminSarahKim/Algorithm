package Baekjoon;

import java.util.Scanner;


/**
 *
 * Baekjoon code #1978
 *
 * Number of N integers given on the first line.
 * N number of integers will be shown on the following line.
 *
 *
 * e.g.)
 * 4
 * 1 3 5 7
 *
 * This is the initial one I coded with.
 * Figured there could be a better way to shorten this one -> check out the code down below.
 *
 * Ironically, runtime increases from 212ms to 224ms, but memory does shrink from 17808 to 17764KB.
 * Not much of difference tho. I would go with the later one since it's much more readable.
 *
 *
 * ******* BIOLER UP! *******************
 * import java.util.Scanner;
 * import java.util.*;
 *
 * public class Main {
 *
 *     public static boolean check(int num) {
 *         for(int j=2; j<=Math.sqrt(num); j++) {
 *             if(num%j == 0) {
 *                 return false;
 *             }
 *         }
 *         return true;
 *     }
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int N = Integer.parseInt(sc.nextLine());
 *         int count = 0;
 *         int[] arr =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
 *         for(int i=0; i<N; i++) {
 *             if(arr[i] == 1) continue;
 *             if(arr[i] ==2 || arr[i] == 3) count++;
 *             else {
 *                 if(check(arr[i])) {
 *                     count++;
 *                 }
 *             }
 *         }
 *
 *         System.out.println(count);
 *
 *     }
 * }
 */

public class P1978 {
    public static boolean check(int num) {
        if(num == 1)
            return false;
        for(int j=2; j<=Math.sqrt(num); j++) {
            if(num%j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int n;
        for(int i=0; i<N; i++) {
            n = sc.nextInt();
            if (check(n)) {
                count++;
            }
        }
        System.out.println(count);

    }
}