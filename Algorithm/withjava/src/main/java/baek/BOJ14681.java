package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        StringTokenizer d = new StringTokenizer(a.readLine());
        int e = Integer.parseInt(c.nextToken());
        int f = Integer.parseInt(d.nextToken());

        if(e<0){
            if(f>0){
                b.write(String.valueOf(2));
            }else{
                b.write(String.valueOf(3));
            }
        }else{
            if(f<0){
                b.write(String.valueOf(4));
            }else{
                b.write(String.valueOf(1));
            }
        }

        b.flush();
        b.close();
    }
}
