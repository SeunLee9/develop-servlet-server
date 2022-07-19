package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        for(int i=1;i<d+1;i++){
            StringTokenizer e = new StringTokenizer(a.readLine());
            int f = Integer.parseInt(e.nextToken());
            int g = Integer.parseInt(e.nextToken());
            b.write("Case #"+ String.valueOf(i) + ": " + String.valueOf(f+g));
            b.newLine();
        }
        b.close();
    }
}
