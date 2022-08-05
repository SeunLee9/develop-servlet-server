package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        String x = "";
        String y = "";
        String z = "";
        ArrayList<String> dd = new ArrayList<>();
        for (int i=0;true;i++){
            StringTokenizer c = new StringTokenizer(a.readLine());
            x = c.nextToken();
            y = c.nextToken();
            z = c.nextToken();
            if(x.equals("#")&&y.equals("0")&z.equals("0")){
                break;
            }
            dd.add(x);
            dd.add(y);
            dd.add(z);
//            dd.add(q);
        }


        for(int i=0;i< dd.size();i+=3){
            b.write(dd.get(i));
            b.write(" ");
            if(Integer.parseInt(dd.get(i+1))>17 || Integer.parseInt(dd.get(i+2))>=80){
                b.write("Senior");
            }else {
                b.write("Junior");
            }
            b.newLine();
        }

        b.close();

    }
}
