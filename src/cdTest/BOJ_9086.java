package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            String str = br.readLine();
            arr.add(str);
        }
        for(String s : arr){
            System.out.println(String.valueOf(s.charAt(0)) + s.charAt(s.length()-1));
        }

    }
}
