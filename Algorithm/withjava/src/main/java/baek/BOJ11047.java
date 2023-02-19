package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ11047 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = Integer.parseInt(st.nextToken());
    int price = Integer.parseInt(st.nextToken());
    int[] coins = new int[count];
    int[] usedCoins = new int[count];
    int answerPrice = 0;
    int totalCCount = 0;

    for(int i=count-1;i>-1;i--){
      coins[i] = Integer.parseInt(br.readLine());
//      System.out.println(i+"번째는"+coins[i]);
    }


    while(answerPrice!=price){
//      System.out.println(answerPrice);
//        System.out.println(coins[1]);
      for(int i=0;i<coins.length;i++){
       while(answerPrice + coins[i]<=price){
//        System.out.println(coins[i]);
//         System.out.println(answerPrice);
         answerPrice += coins[i];
         usedCoins[i]++;
         if(answerPrice+coins[count-1]==price){
           answerPrice += coins[count-1];
           usedCoins[count-1]++;
           break;
         }
//         System.out.println(i+"번 코인사용"+usedCoins[i]);
       }
      }
//      System.out.println("for문도 빠져나옴");
//      System.out.println(answerPrice);
    }

    for (int i=0;i<count;i++){
      totalCCount += usedCoins[i];
//      System.out.println(totalCCount);
    }

//    System.out.println(totalCCount);
    bw.write(String.valueOf(totalCCount));
    bw.close();

  }
}
