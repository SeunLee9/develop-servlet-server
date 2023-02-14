package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2442 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int value = Integer.parseInt(br.readLine());
//    String[] star = new String[(value-1)*2+1]; //+1이 맞아?
    for (int i=0;i<value;i++){
//      for(int j=value-1;j>0;j--){
        bw.write(" ".repeat(value-i-1));
        bw.write("*".repeat(i));
        bw.write("*");
        bw.write("*".repeat(i));
//      }
//      bw.write(star[i]);
      if(i==value-1){
        break;
      }
      bw.newLine();
    }
    bw.close();
  }
}//자바8로도 풀어보기
