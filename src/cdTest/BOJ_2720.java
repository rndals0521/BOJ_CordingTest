package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        for(int i=0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i < n; i++){
            StringBuilder builder = new StringBuilder();
            builder.append(arr[i] / 25).append(" ");
            arr[i] = arr[i] % 25;
            builder.append(arr[i] / 10).append(" ");
            arr[i] = arr[i] % 10;
            builder.append(arr[i] / 5).append(" ");
            arr[i] = arr[i] % 5;
            builder.append(arr[i]).append(" ");

            System.out.println(builder);
        }

    }
}
