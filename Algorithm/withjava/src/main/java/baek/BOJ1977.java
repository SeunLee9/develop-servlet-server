package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1977 {
public static void main(String[]args) throws IOException {
    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer c = new StringTokenizer(a.readLine());
    StringTokenizer cc = new StringTokenizer(a.readLine());
    int d = Integer.parseInt(c.nextToken());
    int e = Integer.parseInt(cc.nextToken());
    double f = 0;
    String g = "";
    int h = 0;
    double ff = 0;
    int fff = 0;
    int ffff = 0;
    ArrayList<Integer> l = new ArrayList<>();

    for (int i=d;i<e+1;i++){
        f = Math.sqrt(i);
        fff = (int)Math.sqrt(i);
        ff = f-fff;
//        g = String.valueOf(f);
        if(ff==0){
//            System.out.println(g);
            ffff += i;
//            System.out.println(i);
            l.add(i);
        }
    }
    if(l.size()==0){
        b.write(String.valueOf(-1));
        b.close();
    }else {
        b.write(String.valueOf(ffff));
        b.newLine();
        b.write(String.valueOf(l.get(0)));
        b.close();
    }
    }
}
