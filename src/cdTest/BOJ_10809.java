package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        Integer[] arr = new Integer[26];
        Arrays.fill(arr, -1);

        for(int i=0; i < arr.length; i++){
            char alpha = (char)(97+i);
            for(int j = 0; j < str.length; j++) {
                if(str[j].equals(Character.toString(alpha))) {
                    arr[i] = j;
                    break;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int n=0; n < arr.length; n++){
           builder.append(arr[n]).append(" ");
        }
        System.out.println(builder);

    }

}
