package baek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        StringTokenizer e = new StringTokenizer(a.readLine());
        int f = Integer.parseInt(e.nextToken());
        StringTokenizer g = new StringTokenizer(a.readLine());
        int h = Integer.parseInt(g.nextToken());
        int j = d * f * h;
        String k = Integer.toString(j); //"17037300"
        String l[] = k.split(""); // [1, 7, 0, 3, 7, 3, 0, 0]
//        String[] stringToSearch={};
        int[] stringToSearch = new int[10];
        for (int i = 0; i < 10; i++) {
//            stringToSearch[i] = String.valueOf(i);
            for (int z = 0; z < l.length; z++) {
                if (String.valueOf(stringToSearch[i]+1) == l[z]) {
                    stringToSearch[i] ++;
                }else {
                    continue;
                }

            }
            b.write(String.valueOf(stringToSearch[i]));
            b.newLine();
        }
        b.flush();
        b.close();

    }
}


//
//        for (int z=0;z<l.length;z++) {
//            for (int i = 0; i < 10; i++) {
//
//            }
//        }
//        for(int x=0;x<10;x++){
//            b.write(String.valueOf(x));
//        }
//
//
//        for(int i=0;i<10;i++){
//            for(int m;m< l.length;i++){
//
//            }
//
//            b.write(String.valueOf(i));
//        }
//
//
//
//
//
//
//
//        for(int i=0;i<10;i++){
//            if(i = i)
//
//
//
//
//
//            i += Integer.parseInt(l[i]);
//            b.write(String.valueOf(i));
//        }
//
//        b.flush();
//        b.close();
//    }
//}
//








//
//        int k[] = new int[10];
//        char l[] = {};
//        for (int i=0;i<k.length;i++){
//            l = h.charAt(i);
//                k[i]++;
//
////            k[i] = Arrays.stream(j).count(i);
//            b.write(String.valueOf(k));
//            b.newLine();
//        }
//        b.flush();
//        b.close();
//    }
//}
