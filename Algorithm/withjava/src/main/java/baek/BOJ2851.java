package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 0;
        int[] d = new int[10];
        for (int i=0;i<10;i++) {
            StringTokenizer e = new StringTokenizer(a.readLine());
            c = Integer.parseInt(e.nextToken());
            d[i] = c;
        }

        int presum = 0;
        int sum = 0;

        for(int i=0;i<d.length;i++){
            if(i==0){
                presum += 0;
            }else {
                presum += d[i-1];
            }
            sum += d[i];
            if(sum>=100){
                if(sum-100>100-presum){
                    b.write(String.valueOf(presum));
                    break;
                } else if (sum-100<100-presum) {
                    b.write(String.valueOf(sum));
                    break;
                } else if (sum-100==100-presum) {
                    b.write(String.valueOf(sum));
                    break;
                }
            } else if (i==9) {
                b.write(String.valueOf(sum));
                break;
            }
        }

        b.close();
    }
}
