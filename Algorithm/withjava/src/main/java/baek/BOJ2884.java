package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int e = Integer.parseInt(c.nextToken());
        int f = 0;

        if(e<45){
            e = e-45;
            e = 60+e;

            if(d==0){
                d=23;
            }else {
                d = d-1;
            }

            b.write(String.valueOf(d));
            b.write(" ");
            b.write(String.valueOf(e));

        }else{
            e = e-45;
            b.write(String.valueOf(d));
            b.write(" ");
            b.write(String.valueOf(e));

        }
        b.close();
    }
}
