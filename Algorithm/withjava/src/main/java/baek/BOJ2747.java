package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2747 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int value = Integer.parseInt(st.nextToken());
    int count = 1;
    int fnum = 0;
    int snum = 1;
    int tnum = 0;

    while(true){
      if(value == 0){
        bw.write(String.valueOf(0));
        break;
      }
      if(value == 1){
        bw.write(String.valueOf(1));
        break;
      }
      count ++;
      tnum = fnum + snum;
      fnum = snum;
      snum = tnum;

      if(value == count){
        bw.write(String.valueOf(tnum));
        break;
      }
    }
    bw.close();
  }
}
