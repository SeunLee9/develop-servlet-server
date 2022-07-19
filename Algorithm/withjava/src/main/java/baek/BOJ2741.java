package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter d = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer q = new StringTokenizer(s.readLine());
        int count = Integer.parseInt(q.nextToken());
        for(int i=0;i<count;i++){
            int sub = count-i;
            d.write(String.valueOf(sub));
            d.newLine();
        }
        d.close();
    }
}
