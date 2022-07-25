package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int e = Integer.parseInt(c.nextToken());

        b.write(String.valueOf(d+e));
        b.newLine();
        b.write(String.valueOf(d-e));
        b.newLine();
        b.write(String.valueOf(d*e));
        b.newLine();
        b.write(String.valueOf(d/e));
        b.newLine();
        b.write(String.valueOf(d%e));
        b.flush();
        b.close();
    }

}

//    public static void main(String[] args) throws IOException {
//        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer c = new StringTokenizer(a.readLine());
//        int d = Integer.parseInt(c.nextToken());
//        int e = Integer.parseInt(c.nextToken());
//
//        b.write(String.valueOf(d+e));
//        b.newLine();
//        b.write(String.valueOf(d-e));
//        b.newLine();
//        b.write(String.valueOf(d*e));
//        b.newLine();
//        b.write(String.valueOf(d/e));
//        b.newLine();
////        string[] f = "+""-""*""/""%";
////        for(int i=0;i<f.length;i++){
////            b.write(String.valueOf(d+f[i]+e));
////        }
////        //이렇게하면 될것같은데
//
//    }
