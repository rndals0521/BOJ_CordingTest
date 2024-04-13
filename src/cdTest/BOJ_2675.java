package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine()," ");
            int rpt = Integer.parseInt(stk.nextToken());
            String str = stk.nextToken();
            StringBuilder builder = new StringBuilder();

            for(int k=0; k<str.length(); k++){
                builder.append(String.valueOf(str.charAt(k)).repeat(Math.max(0, rpt)));
//                for(int j=0; j<rpt; j++){
//                    builder.append(str.charAt(k));
//                }
            }
            System.out.println(builder);

        }



    }
}
