package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int answer = 0;
        for( int i = 0; i < n; i++){
            answer += Integer.parseInt(arr[i]);
        }
        System.out.println(answer);
    }
}
