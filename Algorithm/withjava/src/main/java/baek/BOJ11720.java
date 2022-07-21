package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        StringTokenizer e = new StringTokenizer(a.readLine());
        String h = e.nextToken();
        String[] j = h.split("");
        int k = 0;
        for(int i=0;i<j.length;i++){
                k += Integer.parseInt(j[i]);
        }

        b.write(String.valueOf(k));
        b.flush();
        b.close();
    }
}








//        String[] j = h.split("");
//        int k = 0;
////        int g = 0;
//        for(int i=0;i<d;i++){
////        int f = Integer.parseInt(e.nextToken(""));
////            g += f;
//            k += Integer.parseInt(j);
//        }
//
//        b.write(String.valueOf(g));
//        b.flush();
//        b.close();
//    }
//}
