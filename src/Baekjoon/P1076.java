package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
Baekjoon #1076
https://www.acmicpc.net/problem/1076
It was a good choice using Hashmap but the thing was I should have used int[] array inside the hasmap instead of
creating two hashmaps(what a memory waste...!).
Also, I have no idea why I used for loops for just three inputs fixed. (LOL)
+ BufferedRead does help save runtime.


 */

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<String, Integer> val = new HashMap<String, Integer>();
//        HashMap<String, Long> multiVal = new HashMap<String, Long>();
//        String[] color = {"black","brown", "red", "orange",
//                "yellow", "green", "blue", "violet", "grey", "white"};
//
//        for(int i=0; i<color.length; i++) {
//            val.put(color[i], i);
//            multiVal.put(color[i], (long) (Math.pow(10, i)));
//        }
//
//
//
//        long result = 0;
//        for(int i=0; i<3; i++) {
//            if(i == 2) {
//                System.out.print(result * multiVal.get(sc.next()));
//                break;
//            }
//            result = result * 10 + val.get(sc.next());
//
//        }
//    }

public class P1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] colors =  {"black", "brown", "red", "orange",
        "yellow", "green", "blue", "violet", "grey", "white"} ;

        HashMap<String, int[]> map = new HashMap<>();
        for(int i=0; i<colors.length; i++ ) map.put(colors[i], new int[] {i, (int) Math.pow(10, i)});
        long total = (map.get(reader.readLine())[0] * 10 + map.get(reader.readLine())[0]) * (long)map.get(reader.readLine())[1];
        System.out.print(total);


    }

}







