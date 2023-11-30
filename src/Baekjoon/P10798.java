package Baekjoon;

import java.util.Scanner;

public class P10798 {
/*
Baekjoon #10798
5 of the strings are given, print them out in column wise.

StringBuffer is a thing; it shrinks memory usage from 17712KB up to 17612KB, saves about 100KB..!
Runtime, from 208 to 196ms, shrinks as well.
e.g.
ABCDE
abcde
01234
FGHIJ
fghij

Aa0FfBb1GgCc2HhDd3IiEe4Jj

 */

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int maxLength = 0;
//        ArrayList<String> arr = new ArrayList<String>();
//        for(int i=0; i<5; i++) {
//            String temp = sc.nextLine();
//            if(temp.length() > maxLength) {
//                maxLength = temp.length();
//            }
//            arr.add(temp);
//        }
//        for(int i=0; i<maxLength; i++) {
//            for(int j=0; j<5; j++) {
//                if(arr.get(j).length() <= i) {
//                    continue;
//                }
//                System.out.print(arr.get(j).charAt(i));
//            }
//        }
//
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer result = new StringBuffer();
        String[] inputs = new String[5];
        for(int i=0; i<5; i++) {
            inputs[i] = sc.next();
        }
        for(int j=0; j<15; j++) {
            for(int i=0; i<5; i++) {
                if(inputs[i].length() > j) result.append(inputs[i].charAt(j));
            }
        }

        System.out.println(result.toString());

    }
}
