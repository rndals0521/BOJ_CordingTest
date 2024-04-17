package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i=0; i<n; i++){
            stk = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        for(int i=0; i<n; i++){
            stk = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++){
                arr2[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int[][] answer = new int[n][m];
        for(int i=0; i<n; i++){
            StringBuilder builder = new StringBuilder();
            for(int j=0; j<m; j++){
                answer[i][j] = arr[i][j] + arr2[i][j];
                builder.append(answer[i][j]).append(" ");
            }

            System.out.println(builder);
        }


    }
}
