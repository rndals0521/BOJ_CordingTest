package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        Integer[] numbers = new Integer[stk.countTokens()];

        int n = 0;
        while(stk.hasMoreTokens()){
            numbers[n] = Integer.parseInt(stk.nextToken());
            n++;
        }

        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i=0; i<numbers.length -1; i++) {
            for( int j=i+1; j<numbers.length; j++) {
                if(Objects.equals(numbers[i], numbers[j])) {
                    duplicate.add(numbers[i]);
                }
            }
        }

        int answer = 0;
        if(duplicate.size() == 3) {
            answer = 10000 + (duplicate.get(0)*1000);
        }else if(duplicate.size() == 1){
            answer = 1000 + (duplicate.get(0)*100);
        }else{
            Arrays.sort(numbers);
            Collections.reverse(Arrays.asList(numbers));
            answer = numbers[0] * 100;
        }
        System.out.println(answer);
    }
}
