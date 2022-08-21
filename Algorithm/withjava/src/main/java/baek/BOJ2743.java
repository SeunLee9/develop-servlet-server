package baek;

import java.io.*;

public class BOJ2743 {
    static String[] stringsplit(String cc){
        String[] d = cc.split("");
        return d;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        String c = a.readLine();
//        BOJ2743.stringsplit(c);
        b.write(String.valueOf(BOJ2743.stringsplit(c).length));
        b.close();
    }

}
