package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
//        float d = Double.parseDouble(c.nextToken());
//        float d = Float.parseFloat(c.nextToken());
        int d = Integer.parseInt(c.nextToken());
//        float e = Double.parseDouble(c.nextToken());
//        float e = Float.parseFloat(c.nextToken());
        int e = Integer.parseInt(c.nextToken());
        int f = Integer.parseInt(c.nextToken());
        int count = 0;
        int y = 0;
        int z = 0;
        double g = d/e;

        while(true){
//            if(i==0) {
                y = d / e;
                z = d % e;
                d = z*10;

                count++;
                if(count==f+1){
                    break;
                }
        }




//        String gg = String.valueOf(d/e);
//        String ggg = String.format("%."+f+"f", d/e);

        double h = Math.floor(g*Math.pow(10, f))/Math.pow(10.0, f);
        String i = String.valueOf(h);
        char jj = i.charAt(i.length() - 1);
//        char jjj = ggg.charAt(ggg.length() - 1);


//        String[] i = String.valueOf(h).split(".");
//        String j = String.valueOf(Arrays.asList(i).indexOf(1));



//        String[] last = i.split(".");

//        int z = Integer.parseInt(last);

//        String sdfsd = String.valueOf(System.out.printf("%.2f\n", d/e));
//        b.write(String.valueOf(z));
//        b.write(sdfsd);
//        b.write(String.valueOf(jj));

//        b.write(jjj);

        b.write(String.valueOf(y));
        b.close();
    }

    public String dividdd(double dd, double ee){
        return String.valueOf(dd/ee);
    }
}


//왜 틀렸는지 모르겠다;