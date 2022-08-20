package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        String d = c.nextToken();
        String e = c.nextToken();
        StringBuffer f = new StringBuffer(d);
        StringBuffer g = new StringBuffer(e);
        String h = f.reverse().toString();
        String i = g.reverse().toString();
        int j = Integer.parseInt(h);
        int k = Integer.parseInt(i);
        if (j>k){
            b.write(String.valueOf(j));
        }else {
            b.write(String.valueOf(k));
        }

        b.close();

    }
}
