package Backjoon.Implementation.Q8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        int sum = 0;

        while(n>0) {
            sum += n--;
        }

        System.out.print(sum);
    }
}
