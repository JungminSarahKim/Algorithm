/*
Baekjoon #2675
number of N lines would be given on the first row.
Then # and string would be given, the output should be each character repeated with # times in a row.
e.g.)
2
3 ABC
5 /HTP
--------------------(output below)
AAABBBCCC
/////HHHHHTTTTTPPPPP
logic doesn't change at all; still using three for loops but acquired both memory and runtime efficiency
using BufferReader, InputStreamReader and StringTokenizer.

 */
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st;
        int count; //  = Integer.parseInt(st.nextToken());
        String temp; // = st.nextToken();
        for(int x=0; x<N; x++) {
            st = new StringTokenizer(reader.readLine(), " ");
            count = Integer.parseInt(st.nextToken());
            temp = st.nextToken();
            for (int i = 0; i < temp.length(); i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(temp.charAt(i));
                }

            }
            System.out.println();
        }

    }
//    public static void main(String[] args) {
//        int n = 0;
//        Scanner sc = new Scanner(System.in);
//        int T = Integer.parseInt(sc.nextLine());
//        while(n<T) {
//            String a[] = sc.nextLine().split(" ");
//            for(int i=0; i<a[1].length(); i++) {
//                for(int j=0; j<Integer.parseInt(a[0]); j++) {
//                    System.out.print(a[1].charAt(i));
//                }
//            }
//            System.out.println();
//            n++;
//        }
//
//    }
}
