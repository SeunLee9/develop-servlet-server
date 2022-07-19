package baek;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ15552 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int count = s.nextInt();
//        for(int i=0;i<count;i++){
//            int np = s.nextInt();
//            int tf = s.nextInt();
//            System.out.println(np+tf);
//        }
//    }

    //시간초과로 실패했다 이제 BufferedReader가 필요하다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        int list = Integer.parseInt(tok.nextToken());
        for(int i=0;i<list;i++){
        StringTokenizer tokk = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(tokk.nextToken());
        int two = Integer.parseInt(tokk.nextToken());

            bw.write(String.valueOf(one+two));
            bw.newLine();
        }

        bw.flush();
        bw.close();

            //proud
    }
}
