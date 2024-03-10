package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int numItemType = Integer.parseInt(br.readLine());

        int tempPrice = 0;
        for(int i=0; i<numItemType; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine()," ");
            int price = Integer.parseInt(stk.nextToken());
            int cnt = Integer.parseInt(stk.nextToken());

            tempPrice += price * cnt;
        }

        if(tempPrice == totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
