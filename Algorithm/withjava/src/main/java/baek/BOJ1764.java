package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int e = Integer.parseInt(c.nextToken());
        HashSet<String> f = new HashSet<>(); //듣도 못한 사람들
        ArrayList<String> g = new ArrayList<>(); //보도 못한 사람들
        String hh = "";
        String ll = "";

        //듣도 못한 사람들 입력받기
        for (int i=0;i<d;i++){
            StringTokenizer h = new StringTokenizer(a.readLine());
            hh = h.nextToken();
            f.add(hh);
        }
        //듣도 보도 못한 사람들 입력받기
        for (int i=0;i<e;i++){
            StringTokenizer l = new StringTokenizer(a.readLine());
            ll = l.nextToken();
            if (f.contains(ll)) {
                g.add(ll);
            }
        }
        Collections.sort(g);
        b.write(String.valueOf(g.size()));
        b.newLine();
        for (int i=0;i<g.size();i++){
            b.write(g.get(i));
            b.newLine();
        }
        b.close();

    }
}
