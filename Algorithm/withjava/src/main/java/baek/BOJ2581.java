package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        StringTokenizer e = new StringTokenizer(a.readLine());
        int f = Integer.parseInt(e.nextToken());
//        ArrayList<Integer> g = new ArrayList<>();
        int[] g = new int[f + 2];
        ArrayList<Integer> h = new ArrayList<>();
        int l = 0;
        int sum = 0;

        for (int i = d; i < f + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    g[i]++;
//                    System.out.println(i + "는" + j + "로 나누어 떨어졌습니다");
                }
            }
//            System.out.println(g[i]);
            if (g[i] == 2) {
//            System.out.println("if문 진입 성공");
                h.add(i);
                sum += i;
//                System.out.println(i + "가 소수에 추가 되었습니다");
            }

        }


//        l = Collections.min(h);
//        b.write(String.valueOf(sum));
//        b.newLine();
//        b.write(String.valueOf(l));
//        b.close();

        if (h.size() > 0) {
            l = Collections.min(h);
            b.write(String.valueOf(sum));
            b.newLine();
            b.write(String.valueOf(l));
        } else if (h.size() == 0) {
            l = -1;
            b.write(String.valueOf(l));
        }

        b.close();

        //배운점
        //1. System.out.println();로 체크해서 어디가 문제인지 빠르게 파악하는게 낫겠다
    }
}
