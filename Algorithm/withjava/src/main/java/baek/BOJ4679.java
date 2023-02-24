package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ4679 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    while(true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int height = Integer.parseInt(st.nextToken());
      double climb = Double.parseDouble(st.nextToken());
      int slide = Integer.parseInt(st.nextToken());
      int factor = Integer.parseInt(st.nextToken());
      double fatigue = (double) climb*factor/100;
//      double fatigue = (double) 0;
      double initialH = 0.0;

      if(height==0&&climb==0&&slide==0&&factor==0){
        sb.deleteCharAt(sb.length()-1);
        bw.write(String.valueOf(sb));
        bw.close();
        break;
      }

      //뉴버전
      for(int i=1;true;i++){
//        fatigue = (double) climb*factor/100;
        if(i==1){
          climb = climb;
        }else{
          climb = climb-fatigue;
          if(climb<0){
            climb = 0;
          }
        }
        initialH += climb;
        if(initialH>height){
          sb.append("success on day ").append(i).append("\n");
          break;
        }
        initialH -= slide;
        if(initialH<0){
          sb.append("failure on day ").append(i).append("\n");
          break;
        }


      }
      //뉴버전

//      for(int i=1;true;i++){
////        double success = (double)i*climb-(double)(i-1)*slide-(double)i*(i-1)/2*fatigue;
//        initialH = (double) i * climb - (double) (i - 1) * slide - (double) i * (i - 1) / 2 * fatigue;//성공
////        if((double)i*climb-(double)(i-1)*slide-(double)i*(i-1)/2*fatigue>=0) {
////          initialH += (double) i * climb - (double) (i - 1) * slide - (double) i * (i - 1) / 2 * fatigue;//성공
////        }else {
////          initialH = 0;
////        }
//        if(initialH>height){
////          bw.write("success on day ");
////          bw.write(String.valueOf(i));
////          bw.newLine();
//          sb.append("success on day ").append(i).append("\n");
//          break;
//        }
////        double failure = (double)i*climb-(double)i*slide-(double)i*(i-1)/2*fatigue;
//        initialH -= (double)i*climb-(double)i*slide-(double)i*(i-1)/2*fatigue;
//        if(initialH<0){
////          bw.write("failure on day ");
////          bw.write(String.valueOf(i));
////          bw.newLine();
//          sb.append("failure on day ").append(i).append("\n");
//          break;
//        }
//      }



    }
  }
}
