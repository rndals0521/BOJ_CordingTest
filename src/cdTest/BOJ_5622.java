package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split("");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("B",3);
        map.put("C",3);
        map.put("D",4);
        map.put("E",4);
        map.put("F",4);
        map.put("G",5);
        map.put("H",5);
        map.put("I",5);
        map.put("J",6);
        map.put("K",6);
        map.put("L",6);
        map.put("M",7);
        map.put("N",7);
        map.put("O",7);
        map.put("P",8);
        map.put("Q",8);
        map.put("R",8);
        map.put("S",8);
        map.put("T",9);
        map.put("U",9);
        map.put("V",9);
        map.put("W",10);
        map.put("X",10);
        map.put("Y",10);
        map.put("Z",10);
        int time = 0;
        for (String s : strArr) {
            time += map.get(s);
//            switch (s) {
//                case "A", "B", "C":
//                    time += 3;
//                    break;
//                case "D","E","F":
//                    time += 4;
//                    break;
//                case "G","H","I":
//                    time += 5;
//                    break;
//                case "J","K","L":
//                    time += 6;
//                    break;
//                case "M","N","O":
//                    time += 7;
//                    break;
//                case "P","Q","R","S":
//                    time += 8;
//                    break;
//                case "T","U","V":
//                    time += 9;
//                    break;
//                case "W","X","Y","Z":
//                    time += 10;
//                    break;
//            }
        }
        System.out.println(time);
    }
}
