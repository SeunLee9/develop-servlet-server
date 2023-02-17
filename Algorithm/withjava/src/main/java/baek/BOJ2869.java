package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double a = Double.parseDouble(st.nextToken());
    double b = Double.parseDouble(st.nextToken());
    int v = Integer.parseInt(st.nextToken());
    int height = 0;
    int date = 1;

    double differ = a-b;
    double n = (v-a)/differ;
    int real = (int)Math.ceil(n);
    int answer = real+date;


    bw.write(String.valueOf(answer));
    bw.close();
  }

}
