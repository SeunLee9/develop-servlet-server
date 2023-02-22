package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ1463 {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static int x;
//  public static int[][] memory;
  public static int[] memory = new int[1000001];

  public static void main(String[] args) throws IOException {
    x = Integer.parseInt(br.readLine());
//    memory = new int[x+1];
//    memory = new int[x][]; //[x][4]로해야할것 같은데 일단해봄
//    System.out.println(findOne(x));
    bw.write(String.valueOf(findOne(x)));
    bw.close();
  }

  public static int findOne(int x){

//    memory = new int[x+1][4];
//
//    if(x==1){
//      memory[1][1] = 1;
//      memory[1][2] = 0;
//      memory[1][3] = 0;
//    }
//    if(x%3==0) {
//      memory[x][3] = findOne(x / 3);
//    }else {
//      memory[x][3] = 1000001;
//    }
//    if(x%2==0) {
//      memory[x][2] = findOne(x / 2);
//    }else {
//      memory[x][2] = 1000001;
//    }
//    if(x>1){
//      memory[x][1] = findOne(x - 1);
//    }else {
//      memory[x][1] = 1000001;
//    }
//
//
////    if(x==1){
////      memory[1] = 1;
////      return memory[1];
////    } else if (x==2) {
////      memory[2] = 1;
////      return memory[2];
////    } else if (x==3) {
////      memory[3] = 1;
////      return memory[3];
////    }else {
////
////    }

//    memory[x][1] =

    int[] currentValues = new int[4];
    currentValues[0] = 1000001;

    if(memory[x]>0){
      return memory[x];
    } else if (x==1) {
      memory[1] = 0;
      return memory[1];
    } else if (x==2) {
      memory[2] = 1;
      return memory[2];
    } else if (x==3) {
      memory[3] = 1;
      return memory[3];
    } else {
      if(x%3==0){
//        currentValues[3] = memory[(int)x/3];
        currentValues[3] = findOne(x/3)+1;
      } else {
        currentValues[3] = 1000001;
      }
      if(x%2==0){
//        currentValues[2] = memory[(int)x/2];
        currentValues[2] = findOne(x/2)+1;
      }else {
        currentValues[2] = 1000001;
      }
      if(x>1){
//        currentValues[1] = memory[x-1];
        currentValues[1] = findOne(x-1)+1;
      }
      }

    memory[x] = 1000001;
//    System.out.println(currentValues[1]);
    for(int i=0;i<currentValues.length;i++){
      if(currentValues[i]<memory[x]){
        memory[x] = currentValues[i];
      }
    }
//    return memory[x];
//    System.out.println("x가 "+x + "일때 currentValue[0]" + currentValues[0]);
//    System.out.println("x가 "+x + "일때 currentValue[1]" + currentValues[1]);
//    System.out.println("x가 "+x + "일때 currentValue[2]" + currentValues[2]);
//    System.out.println("x가 "+x + "일때 currentValue[3]" + currentValues[3]);
//      memory[x] = Arrays.stream(currentValues).min().getAsInt(); //stream 틀렸다고뜸
//    System.out.println("x가" + x + "일때 memory[x]" + memory[x]);
      return memory[x];
    }

  }


  //ver1
  //문제유형:메모제이션을 활용한 가장 작은수 판별
  //재귀함수를 만든다
  //값이 존재할경우,
  //값이 존재하지않을경우,
  //- 기능1: 이때까지 구현한 횟수 저장
  //- 기능2: 셋중 가장 작은것 판별
  //ver1은 너무 추상적임

  //ver2
  //문제유형:메모제이션을 활용한 가장 작은수 판별
  //메모제이션 구현 : "정답값"을 저장하는 배열을 만든다.
  //재귀함수를 만든다.
  //재귀함수의 기능1.메모제이션에 "정답값"이 존재할 경우: "정답값"을 반환한다.
  //재귀함수의 기능2.초기값의 메모제이션 : 초기설정값을 반환한다.
  //재귀함수의 기능3.메모제이션에 "정답값"이 존재하지 않을 경우: "정답값"을 만들어서 반환한다.

