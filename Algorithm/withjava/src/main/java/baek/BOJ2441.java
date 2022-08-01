package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int count = 0;
        for (int i=d;i>0;i--){ //54321
            for (int k=0;k<d-i;k++){ //0 1 2 3 4
                    b.write(" ");
                }
            for(int j=0;j<i;j++) { //5번 반복 4번 반복 3번 반복 2번반복 1번 반복

                b.write("*");
            }

            b.newLine();

        }
        b.close();
    }
}