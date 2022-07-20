package baek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        int c[] = new int[9];
        for(int i=0;i<9;i++){
            StringTokenizer d = new StringTokenizer(a.readLine());
            int e = Integer.parseInt(d.nextToken());
            c[i] = e;
        }
        int f = Arrays.stream(c).max().getAsInt();
        int g = 0;
        for (int i=0;i<c.length;i++){
            if(c[i]==f){
                g = i+1;
            }
        }

        b.write(String.valueOf(f));
        b.newLine();
        b.write(String.valueOf(g));
        b.close();
    }
}
