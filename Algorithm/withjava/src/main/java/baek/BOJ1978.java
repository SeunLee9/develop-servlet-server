package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        StringTokenizer d = new StringTokenizer(a.readLine());
        int e = Integer.parseInt(c.nextToken());

        ArrayList<Integer> f = new ArrayList<>();
        int[] h = new int[e];


        for (int i = 0; i < e; i++) {
            h[i] = Integer.parseInt(d.nextToken());
        }
        //여기까지 완벽함

        for (int i = 0; i < e; i++) {
            int count = 0;
            for (int j = 1; j < h[i] + 1; j++) {
                if (h[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                f.add(h[i]);
            }
        }

        b.write(String.valueOf(f.size()));
//        b.write(String.valueOf(h[1]));
        b.close();


    }

}

// 이건 진짜 뭐가 잘못된거지??
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer c = new StringTokenizer(a.readLine());
//        StringTokenizer d = new StringTokenizer(a.readLine());
//        int e = Integer.parseInt(c.nextToken());
//        int count = 0;
//        ArrayList f = new ArrayList<>();
//        int[] h = new int[e];
//
//        for(int i=0;i<e;i++) {
//            h[i] = Integer.parseInt(d.nextToken());
//        }
//
//
//        for(int i=0;i<e;i++){
//            for(int j=1;j<h[i]+1;j++){
//                if(h[i]%j==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                f.add(h[i]);
//            }
//        }
//
//        b.write(String.valueOf(f.size()));
//        b.close();
//
//    }




//    public static void main(String[] args) throws IOException {
//        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer c = new StringTokenizer(a.readLine());
//        int d = Integer.parseInt(c.nextToken());
//
//        for(int i=0;i<d;i++){
//            if(d = d/i){
//                if()
//            }
//        }
//    }
//}
