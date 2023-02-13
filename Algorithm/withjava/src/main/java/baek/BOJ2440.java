package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2440 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int value = Integer.parseInt(br.readLine());

    for(int i=0;i<value;i++){
      for(int j=value;j-i>0;j--){
        bw.write("*");
      }
      if(i==value-1){
        break;
      }
      bw.newLine();
    }
    bw.close();
  }
}
