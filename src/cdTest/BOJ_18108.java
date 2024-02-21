package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18108 {
    public static void main(String[] args) throws IOException {
        //System.out.println("1998년생인 내가 태국에서는 2541년생?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int year = Integer.parseInt(st) - 543;
        System.out.println(year);
    }
}
