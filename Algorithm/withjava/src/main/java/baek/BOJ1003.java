package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1003 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int times = Integer.parseInt(st.nextToken());
    int num = 0;
    int count[][];

    for(int i=0;i<times;i++){
      num = Integer.parseInt(br.readLine());
      count = new int[num+1][2];
      bw.write(fibo(count,num)[0] + " " + fibo(count,num)[1]);
      bw.newLine();
    }
    bw.close();
  }

  public static int[] fibo(int[][] count, int num){
    if(num == 0){
      count[0][0] = 1;
      count[0][1] = 0;
      return count[0];
//      return fibo(count,0);
    } else if (num == 1) {
      count[1][0] = 0;
      count[1][1] = 1;
      return count[1];
//      return fibo(count,1);
    }
    else if (count[num][0]!=0 | count[num][1]!=0) {
      return count[num];
    }
    else {
//      count[num][0] = count[num-1][0] + count[num-2][0];
//      count[num][1] = count[num-1][1] + count[num-2][0];
      count[num][0] = fibo(count, num-1)[0] + fibo(count, num-2)[0];
      count[num][1] = fibo(count, num-1)[1] + fibo(count, num-2)[1];
      return count[num];
//      return fibo(count,num);
    }
  }
}
