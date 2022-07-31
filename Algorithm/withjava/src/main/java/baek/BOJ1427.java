package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        ArrayList<Integer> d = new ArrayList<>();
        String e = String.valueOf(c.nextToken());
        String[] f = e.split("");
        int g = 0;

        for(int i=0;i<f.length;i++){
            g = Integer.parseInt(f[i]);
            d.add(g);
        }

        Collections.sort(d, Collections.reverseOrder());


        for(int i=0;i<d.size();i++){
            b.write(String.valueOf(d.get(i)));
        }

        b.close();
    }
}
