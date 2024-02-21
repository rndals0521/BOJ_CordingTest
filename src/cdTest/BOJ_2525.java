package cdTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nowTime = br.readLine();
        StringTokenizer st = new StringTokenizer(nowTime," ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int takeTime = Integer.parseInt(br.readLine());

        if(minute + takeTime >= 60){
            hour += (minute+takeTime)/60;
            if(hour >= 24){
                hour -= 24;
            }
            minute = (minute+takeTime)%60;
        }else{
            minute = minute + takeTime;
        }

        System.out.println(hour + " " + minute);
    }
}
