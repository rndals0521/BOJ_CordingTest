package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine()," ");

        String str1 = stk.nextToken();
        String str2 = stk.nextToken();


        /*
        String[] A = stk.nextToken().split("");
        String[] B = stk.nextToken().split("");


        String[] reverseA = new String[A.length];
        String[] reverseB = new String[B.length];

        for(int i=A.length-1,j=0; i >= 0; i--,j++) {
            reverseA[j] = A[i];
        }
        for(int i=B.length-1,j=0; i >= 0; i--,j++) {
            reverseB[j] = B[i];
        }

        System.out.println(Arrays.toString(reverseA));
        System.out.println(Arrays.toString(reverseB));

        StringBuilder strA = new StringBuilder();
        StringBuilder strB = new StringBuilder();

        for (String s : reverseA) {
            strA.append(s);
        }

        for (String s : reverseB) {
            strB.append(s);
        }

        if (Integer.parseInt(String.valueOf(strA)) > Integer.parseInt(String.valueOf(strB))) {
            System.out.println(strA);
        } else {
            System.out.println(strB);
        }
        */
    }
}
