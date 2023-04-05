package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ5591 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int allLen = Integer.parseInt(st.nextToken());
    int partLen = Integer.parseInt(st.nextToken());
    int[] allArr = new int[allLen];
    for(int i=0;i<allLen;i++){
      allArr[i] = Integer.parseInt(br.readLine());
    }
    int sum = 0;
    int max = 0;
    int imax = 0;
    for(int i=0;i<allLen-partLen+1;i++){
      if(i==0){
        for(int j=0;j<partLen;j++){
          sum += allArr[j];
          max = sum;
        }
      }
      if(i>0){
        sum = sum-allArr[i-1]+allArr[partLen+i-1];
        imax = sum;
        if(imax>max){
          max = imax;
        }
      }
    }

    bw.write(String.valueOf(max));
    bw.close();
  }

  //1.문제이해
  // 첫째줄에 원소의 개수와 연속된수 k가 주어진다
  // 연속된 k개의 원소가 최대값이 되는것을 구하는 문제다
  //2.문제해결전략
  // 먼저 0일때 k개의 합을 구하고,
  // 그다음 첫번째 원소를 빼고 k+1의 원소를 더하면 될것같다.
  // 그리고 동시에 max도 체크
  // 시간복잡도 문제없음 메모리 문제없음
  //3.의사코드
  //max초기화
  //sum초기화
  // for(n-k+1){
  // if(i=0){
  //    for(j,k){
  //    sum = 처음배열[j]++;
  //    }
  //max= sum (저장)
  // }
  //if(i>0){
  // sum = sum-처음배열[i-1]+처음배열[i+k]
  //
  //imax = sum
  //if(imax>max){
  // max = imax
  // }
  // }
  // }
  //4.개선사항
  //4-1. 풀었던 방법과 다른방식으로 풀고 싶었는데 자료구조가 익숙하지않아서 시간복잡도를 장점과 단점이 좀 헷갈렸다. 자료구조에 좀 더 익숙해지면 해결될것같다
  //4-2. 배열 범위 연습을 좀 해야할듯 맨날 한번씩 틀린다 꼭 할 필요가 있다 문제 만들어서 하자
  //4-3. 브레이크 포인트는 적게쓰자
  //4-4. 변수를 많이쓰면 그만큼 더 꼼꼼하게보자
}
