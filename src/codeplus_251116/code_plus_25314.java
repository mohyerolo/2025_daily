package codeplus_251116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_plus_25314 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String four = "long ";

        int fourDivide = N / 4;
        // N은 4의 배수라는 제한이 있어서 아래는 필요 없음
        // int fourMode = N % 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fourDivide; i++) {
            sb.append(four);
        }

        // if (fourMode != 0) {
        //     sb.append(four);
        // }

        sb.append("int");
        System.out.println(sb.toString());
    }
}
