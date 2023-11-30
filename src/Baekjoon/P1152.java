package Baekjoon;

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
Baekjoon #1152
Count number of words from the string.
e.g.
The Curious Case of Benjamin Button
6
---------------------------------
 The first character is a blank
 6
 -------------------------------
 The last character is a blank
 6


BufferedReader does save significant amount of runtime and memory; 38116KB to 20016KB(memory) and 528ms to 276ms.

 */
public class P1152 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        System.out.println(line.isBlank()? 0: line.trim().split(" ").length );
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        System.out.println(st.countTokens());
    }

}
