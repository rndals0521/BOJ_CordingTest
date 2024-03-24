package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());
        int w = Integer.parseInt(stk.nextToken());
        int h = Integer.parseInt(stk.nextToken());

        int a = w - x;
        int b = h - y;

        int[] arr = {a,b,x,y};
        int answer = Arrays.stream(arr).min().orElse(0);

        System.out.println(answer);
    }
}
