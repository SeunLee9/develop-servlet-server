package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2490 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = null;
    int count = 0;

    for(int i=0;i<3;i++){
      st = new StringTokenizer(br.readLine());
      for (int j=0;j<4;j++){
        if(st.nextToken().equals(String.valueOf(1))){
          count++;
        }
      }
      switch(count){
        case 3:
          bw.write("A");
          break;
        case 2:
          bw.write("B");
          break;
        case 1:
          bw.write("C");
          break;
        case 0:
          bw.write("D");
          break;
        case 4:
          bw.write("E");
          break;
      }
      count = 0; // 카운트초기화
      if(i<2){
        bw.newLine();
      }
    }
    bw.close();
  }
}
