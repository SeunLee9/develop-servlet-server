package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int e = Integer.parseInt(c.nextToken());
        ArrayList<Integer> f = new ArrayList<>();
        for (int i=1;i<e+1;i++){
            for(int j=1;j<i+1;j++){
                f.add(i);
            }
        }
        int count =0;
        for (int i=d-1;i<e;i++){
            count += f.get(i);
        }
        b.write(String.valueOf(count));
        b.close();
    }
}
