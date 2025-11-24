//https://www.acmicpc.net/problem/11720
package dotialgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1_숫자의합 {

    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        // 알고리즘 문제에서는 stream은 병렬처리가 아닌 이상 최적화 시키기 힘듦
        // int sum = num.chars().map(ch -> ch - '0').sum();
        int sum = 0;
        // O(N)
        for (char ch : num.toCharArray()) {
            sum += ch - '0';
        }

        System.out.println(sum);
    }
}
