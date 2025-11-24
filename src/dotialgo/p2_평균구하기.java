// https://www.acmicpc.net/problem/1546
package dotialgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2_평균구하기 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int origin = 0;
        int M = 0;
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            M = M < score ? score : M;
            origin += score;
        }
        System.out.println(((double) origin / M * 100) / N);
    }
}
