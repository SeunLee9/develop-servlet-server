package baek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int e[] = new int[d];
        StringTokenizer f = new StringTokenizer(a.readLine());


        for(int i=0;i<d;i++){
            int g = Integer.parseInt(f.nextToken());
            e[i] = g;
        }
        int h = Arrays.stream(e).min().getAsInt();
        int j = Arrays.stream(e).max().getAsInt();
        b.write(String.valueOf(h));
        b.newLine();
        b.write(String.valueOf(j));
        b.flush();
        b.close();

        //잘모르겠다
    }
}
