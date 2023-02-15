package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2443 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int value = Integer.parseInt(br.readLine());
    int count = 0;

    for(int i=value*2-1;i>0;i-=2){
      bw.write(" ".repeat(count));
      bw.write("*".repeat(i));
      if(i==1) {
        break;
      }
      count++;
      bw.newLine();
    }
    bw.close();
  }

}//자바8로도 해보기
