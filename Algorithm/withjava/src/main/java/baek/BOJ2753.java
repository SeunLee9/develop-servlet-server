package baek;


import java.io.*;
import java.util.StringTokenizer;

public class BOJ2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());


        if(d%400==0){
            b.write(String.valueOf(1));
        } else if (d%4==0) {
            if(d%100!=0){
                b.write(String.valueOf(1));
            }else {
                b.write(String.valueOf(0));
            }
        } else {
            b.write(String.valueOf(0));
        }

        b.flush();
        b.close();
    }
}
