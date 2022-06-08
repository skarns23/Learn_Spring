package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine()); // 입력받는 배열의 크기
        int[][] arr = new int [len][len];
        br.read(); // 버퍼에 남아있는 \n
        for(int i =0; i <len;i++){
            String str = br.readLine();
            for(int j = 0 ; j<len;j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }
        int row= 0;
        int col = 0;
        int count = 1;
        long start_time = System.currentTimeMillis();
        while(row!=(len-1) ||col!=(len-1)){
            if(arr[row][col+1]==1)
                col++;
            else if(arr[row+1][col]==1)
                row++;
            count++;

        }

        long end_time = System.currentTimeMillis();
        System.out.println(start_time+" "+end_time);
        System.out.println(count);
        System.out.println((end_time-start_time));
    }
}