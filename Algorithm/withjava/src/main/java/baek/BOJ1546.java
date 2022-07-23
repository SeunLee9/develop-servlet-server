package baek;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        StringTokenizer d = new StringTokenizer(a.readLine());
        int e = Integer.parseInt(c.nextToken());
        double[] g = new double[e];
        double sum = 0;

        for(int i=0; i<e;i++){
            g[i] = Double.parseDouble(d.nextToken());
        }


        OptionalDouble maxone = Arrays.stream(g).max();
        if(maxone.isPresent()) {
            double max = maxone.getAsDouble();


            for (int i = 0; i < e; i++) {
//                if (g[i] != max) {
                    g[i] = (g[i] / max) * 100.00;
//                    b.write(String.valueOf(g[i]));
//                    b.newLine();
//                }
                sum += g[i];

            }


            double fin = sum / e;

            b.write(String.valueOf(fin));
            b.close();


        }
    }
}





//        for(int j=0;j<g.length;j++){
////            if(g[i]>)
//        }



// 29+33 if문때문에 안됐었다 왜 그럴까? 난 max가 아닌건 전부 나누고, max는 그대로 sum에 대입해주려고했는데

