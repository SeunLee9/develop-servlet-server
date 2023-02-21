package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1063 {

  static int[][] board;
  static int x;
  static int y;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String kingLocation = st.nextToken();
    String stoneLocation = st.nextToken();
    int moveCount = Integer.parseInt(st.nextToken());

    int kingLocationIntX = returnInt(kingLocation)[0];
    int kingLocationIntY = returnInt(kingLocation)[1];

    int stoneLocationIntX = returnInt(stoneLocation)[0];
    int stoneLocationIntY = returnInt(stoneLocation)[1];

    int preKX = 0;
    int preKY = 0;
    int preSX = 0;
    int preSY = 0;

    for(int i=0;i<moveCount;i++){
      String message = br.readLine();
      preKX = kingLocationIntX;
      preKY = kingLocationIntY;
      preSX = stoneLocationIntX;
      preSY = stoneLocationIntY;


        kingLocationIntX = moveMove(message, preKX, preKY)[0];
        kingLocationIntY = moveMove(message, preKX, preKY)[1];
        if (kingLocationIntX == preSX && kingLocationIntY == preSY) {
          stoneLocationIntX = moveMove(message, preSX, preSY)[0];
          stoneLocationIntY = moveMove(message, preSX, preSY)[1];
        }
      if (kingLocationIntX>8||
          kingLocationIntX<1||
          kingLocationIntY>8||
          kingLocationIntY<1||
          stoneLocationIntX>8||
          stoneLocationIntX<1||
          stoneLocationIntY>8||
          stoneLocationIntY<1) {
        kingLocationIntX = preKX;
        kingLocationIntY = preKY;
        stoneLocationIntX = preSX;
        stoneLocationIntY = preSY;
      }

    }



    bw.write(returnString(kingLocationIntX,kingLocationIntY));
    bw.newLine();
    bw.write(returnString(stoneLocationIntX,stoneLocationIntY));
    bw.close();
  }

  public static int[] returnInt(String string){
    String[] divided = string.split("");
    int[] locationInt = new int[2];
    switch(divided[0]){
      case "A": locationInt[0] = 1;
        break;
      case "B": locationInt[0] = 2;
        break;
      case "C": locationInt[0] = 3;
        break;
      case "D": locationInt[0] = 4;
        break;
      case "E": locationInt[0] = 5;
        break;
      case "F": locationInt[0] = 6;
        break;
      case "G": locationInt[0] = 7;
        break;
      case "H": locationInt[0] = 8;
        break;
    }
    locationInt[1] = Integer.parseInt(divided[1]);

    return locationInt;
  }

  public static String returnString(int x, int y){
    String xy = null;
    switch(x){
      case 1: xy="A"+String.valueOf(y);
      break;
      case 2: xy="B"+String.valueOf(y);
      break;
      case 3: xy="C"+String.valueOf(y);
      break;
      case 4: xy="D"+String.valueOf(y);
      break;
      case 5: xy="E"+String.valueOf(y);
      break;
      case 6: xy="F"+String.valueOf(y);
      break;
      case 7: xy="G"+String.valueOf(y);
      break;
      case 8: xy="H"+String.valueOf(y);
      break;
    }

    return xy;
  }

  public static int[] moveMove(String string, int x, int y){
    switch(string){
      case "R": x++;
      break;
      case "L": x--;
      break;
      case "B": y--;
      break;
      case "T": y++;
      break;
      case "RT": x++; y++;
      break;
      case "LT": x--; y++;
      break;
      case "RB": x++; y--;
      break;
      case "LB": x--; y--;
      break;
    }
    int[] newLocation = {x,y};
    return newLocation;
  }

  //킹의 현재위치를 2차원배열로 표현한다
  //돌멩이의 현재위치를 2차원배열로 표현한다
  //움직이는 함수를 만든다
  //반복문으로 킹이 움직이는 함수를 구현한다 {
  // 그 안에 돌멩이와 위치가 같아진다면, 돌멩이도 똑같이 움직이는 함수를 구현한다
  // 킹 또는 돌멩이의 위치가 범위를 벗어난다면 이 반복이 돌기전 위치로 되돌린다
  // }
}
//  static void king(String value){
//    switch(value){
//      case "R":
//
//    }
//  }
//  static void stone(int value){
//
//  }
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//    String initialK = st.nextToken();
//    String initialS = st.nextToken();
//    int repeat = Integer.parseInt(st.nextToken());
//    int[][] map = new int[8][8];
//    String move = null;
//
//    for(int i=0;i<repeat;i++){
//      move = br.readLine();
//      //king에 RB입력
//      //king이랑 stone이랑 위치같으면 스톤도 똑같은 위치 움직임
//    }
//  }
//}
