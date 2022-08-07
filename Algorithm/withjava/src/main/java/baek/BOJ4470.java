package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        for(int i=0;i<d;i++){
            b.write(String.valueOf(i+1) + ". "+ a.readLine());
            b.newLine();
        }
        b.close();
    }
}
