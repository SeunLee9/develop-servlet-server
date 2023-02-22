package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10798 {

  //행렬로 생각하자
  //행을 하나씩 읽어서 집어넣고
  //첫번째열부터 읽으면됨
  //중간에 없으면 건너뛰기

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char[][] mat = new char[5][15];
    StringBuilder result = new StringBuilder();
    int maxlen = 0;
    int len = 0;

//    for (int i = 0; i < 5; i++) {
//      String in = br.readLine();
//      mat[i] = in.toCharArray();
//      maxlen = Math.max(maxlen, mat.length);
//    }
//
//    for (int i = 0; i < maxlen; i++) {
//      for (int j = 0; j < 5; j++) {
//        if (i < mat[j].length) {
//          result.append(mat[j][i]);
//        }
//      }
//    }
//
//    bw.write(result.toString());
//    bw.close();
//  }
//}

    //2t

    int max = 0;
    for (int i = 0; i < 5; i++) {
      String st = br.readLine();
      len = st.length();
      for (int j = 0; j < len; j++) {
        mat[i][j] = st.charAt(j);
      }
    }
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        if (mat[j][i]=='\0') {
          continue;
        }else {
          result.append(mat[j][i]);
        }
      }
    }
    bw.write(String.valueOf(result));
    bw.close();

  }
}



//      len = newlen;
//      newlen = st.countTokens();
//      arrayList.add(st);
//      if(i>0){
//          if(newlen>len){
//            maxlen = newlen;
//          } else {
//            maxlen = len;
//          }
//        }
//      bw.write(String.valueOf(result[1]));
//      bw.newLine();
//      bw.write(String.valueOf(result[1][3]));
//      bw.newLine();

//    bw.close();
//    }


//    StringTokenizer st = null;
//    int j = 0;
//    String[][] data = new String[5][j];
//    int[] arrayLength = new int[5];
//    int arraymax = 0;
//
//    for(int i=0;i<5;i++){
//      st = new StringTokenizer(br.readLine());
//      for(j=0;st.hasMoreTokens();j++){
//        data[i][j] = st.nextToken();
//        arrayLength[i] ++;
//      }
//      if(i>0){
//        if(arrayLength[i-1]<arrayLength[i]){
//          arraymax = arrayLength[i];
//        }
//        else {arraymax = arrayLength[i-1];}
//      }
//    }
//
//    for(j=0;j<arraymax;j++)
//    for (int i=0;i<5;i++){
//      if()
//    }




//    while(true){
//      st = new StringTokenizer(br.readLine());
//      bw.write(String.valueOf(st));
//      if(st == null){
//        break;
//      }
//    }
//        bw.close();



//    while(input=br.readLine()!=null) {
//      st = new StringTokenizer(br.readLine());
//      for (int i = 0; i < st.countTokens(); i++) {
//
//      }
//    }
//    int[] a = {1, 2, 3, 4} ;
//    ArrayList



//  static class Input {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer stk = new StringTokenizer(br.readLine());
//    String st =  String.valueOf(stk.nextToken());
//
//    Input() throws IOException {
//    }
//  }
//
//  public static void main(String[] args) throws IOException {
//    Input input = new Input();
//    String inpuut = input.st;
//    System.out.println(inpuut+"a");
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    bw.flush();
//    bw.close();
//  }
