package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ13216 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        String d = c.nextToken();
        ArrayList<String> e = new ArrayList<>();
        int ee = d.length();
        String[] f;
        f = d.split("");
        for (int i=0;i<d.length();i++){
            e.add(f[i]);
        }
        
        
        int countA = 0;
        int countB = 0;
        int winA = 0;
        int winB = 0;

        for(int i=0;i<e.size();i++){
            if(e.get(i).equals("A")){
                countA ++;
            } if (e.get(i).equals("B")) {
                countB ++;
            } if (countA == 21|| countB == 21) {
                if(countA == 21){
                    winA++;
                }
                if(countB ==21){
                    winB++;
                }
                b.write(String.valueOf(countA));
                b.write("-");
                b.write(String.valueOf(countB));
                b.newLine();
                countA=0;
                countB=0;



            }
        }
        if(winA>winB){
            b.write("A");
        }else {
            b.write("B");
        }
//        b.write(e.get(2));
        b.close();
//        for
//        if Array.get[i] == A
//        countA ++;
//        if Array.get[i] == B
//        countB ++;
//        어레이리스트가 비었다면 break;
        
//        if(countA ==21 | countB ==21){
//        b.write(String.valueOf(countA) - String.valueOf(countB)}


    }
}
