package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());
        int[] count = new int[d];
        ArrayList<String> z = new ArrayList<>();

        for (int i=0;i<d;i++){
            String f = a.readLine();
            String g = f.replace(" ","");
            z.add(g);
        }


        for(int i=0;i<d;i++){ //학생번호
            for(int j=0;j<d;j++){ //비교학생번호
            for (int k=0;k<5;k++){ //k학년때반
                    if(i!=j) //{
                        if (z.get(i).charAt(k) == z.get(j).charAt(k)) {
                            count[i]++;
                            break;
//                        } else if () {

                        }
                    //}
                }
            }
        }

        int max = Arrays.stream(count).max().getAsInt();
        //여기까진잘된듯
        //배열에 점수기록하는것까지 됐음
        //아니다 다중계산을 못했다
        //
        int maxstu = 0;
        for (int i=0;i<d;i++){
            if(max==count[i]){
                maxstu=i+1;
                break;
            }
//            if(Arrays.stream(count).max().getAsInt()==count[i]){
//                b.write(String.valueOf(i+1));
//                break;
//            }
        }


//        public static int find(int[] aa, int target){
//            return Arrays.stream(aa).boxed().collect(Collectors.toList()).indexOf(target);
//        }

        b.write(String.valueOf(maxstu));
//        b.write(String.valueOf(max));
        b.close();

        //출력할떄는 +1해야할듯 0번학생이 없으니

//        for (int i=;i<5;i++){
//            StringTokenizer f = new StringTokenizer(a.readLine());
//            for(int j=0;j<5;j++){
//
//            }
//        }

        //리팩토링 꼭 해야할듯 for문이 너무 많음
    }
}
