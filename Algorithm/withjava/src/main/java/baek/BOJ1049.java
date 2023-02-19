package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1049 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int broken = Integer.parseInt(st.nextToken());
    int brandCount = Integer.parseInt(st.nextToken());
    int[] sixPrice = new int[brandCount];
    int[] onePrice = new int[brandCount];

    for(int i=0;i<brandCount;i++){
      StringTokenizer newLine = new StringTokenizer(br.readLine());
      sixPrice[i] = Integer.parseInt(newLine.nextToken());
      onePrice[i] = Integer.parseInt(newLine.nextToken());
    }

    double needSet = (double) broken / 6.0;
    int needSetInt = (int) needSet;
    if (needSet - needSetInt > 0) {
      needSetInt++;
    }

    System.out.println(needSet);

    bw.write(String.valueOf(howMuch(broken,brandCount,needSetInt,sixPrice,onePrice)));
    bw.close();
  }

  public static int howMuch(int broken,int brandCount,int needSetInt, int[] sixPrice,int[] onePrice) {

    int[] totalSetPrice = new int[brandCount];
    int[] totalOnePrice = new int[brandCount];
    int[] totlaComboPrice = new int[brandCount];
    int needEtcInt = broken%6;
    System.out.println(needEtcInt);

    for(int i=0;i<brandCount;i++){
      totalSetPrice[i] = sixPrice[i]*needSetInt;
      totalOnePrice[i] = onePrice[i]*broken;
    }


    int minSet = Arrays.stream(totalSetPrice).min().getAsInt();
    int minOne = Arrays.stream(totalOnePrice).min().getAsInt();

    int total = Math.min(minSet,minOne);

    if(needEtcInt>0){
      int newTotal = minSet-Arrays.stream(sixPrice).min().getAsInt()+needEtcInt*Arrays.stream(onePrice).min().getAsInt();
      total = Math.min(total,newTotal);
    }

    return total;
  }

}
