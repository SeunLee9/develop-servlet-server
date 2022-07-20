package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15596 {
//    public static void main(String[] args) throws IOException {
////        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
////        StringTokenizer c = new StringTokenizer(a.readLine());
////        int[] d = 0;
////        d = Integer.parseInt(c.nextToken());
//
//        test test = new test();
//    }


    static class test{
        long sum(int[] a){
            int total =0;
            for(int i=0;i<a.length;i++){
                total += a[i];
            }
            return total;
        }
        //직접 적었는데 제출에 양식이 어느정도 있었다 다음부턴 제출을 먼저 체크하는것도 좋을듯
    }
}
