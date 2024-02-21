package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11382 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String[] stArr = st.split(" ");

        long answer = 0;
        for(String s : stArr){
            answer += Integer.parseInt(s);
        }
        System.out.println(answer);

    }
}
