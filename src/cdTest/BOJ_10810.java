package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        Integer[] basket = new Integer[N];
        for (int k = 0; k < basket.length; k++){
            basket[k] = 0;
        }
        for( int i=0; i<M; i++) {
            String[] putBall = br.readLine().split(" ");
            for( int j= Integer.parseInt(putBall[0]) - 1; j < Integer.parseInt(putBall[1]) ; j++){
                if(basket[j] != Integer.parseInt(putBall[2])){
                    basket[j] = Integer.parseInt(putBall[2]);
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for( int s=0; s<basket.length; s++) {
            str.append(basket[s]).append(" ");
        }
        System.out.println(str);
    }

}
