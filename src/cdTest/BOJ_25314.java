package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();

        for( int i = n; i > 0; i = i-4 ){
            str.append("long ");
        }

        System.out.println(str + "int");
    }
}
