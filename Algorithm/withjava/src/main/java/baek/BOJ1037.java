package baek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        StringTokenizer e = new StringTokenizer(a.readLine());
        int[] f = new int[d];
        for (int i=0;i<d;i++){
            f[i] = Integer.parseInt(e.nextToken());
        }
        int g = Arrays.stream(f).max().getAsInt();
        int h = Arrays.stream(f).min().getAsInt();
        int j = g*h;

        b.write(String.valueOf(j));
        b.close();
    }
}
