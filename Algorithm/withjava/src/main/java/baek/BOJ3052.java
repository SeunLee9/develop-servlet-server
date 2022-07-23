package baek;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
//        int[] numbers = {};
        int[] numbers = new int[10];
        ArrayList<Integer> variety= new ArrayList<>();
        int diff = 0;

        for(int i=0;i<10;i++) {
            StringTokenizer numString = new StringTokenizer(a.readLine());
            numbers[i] = (Integer.parseInt(numString.nextToken()))%42;

        }


        for(int i=0;i<10;i++) {
//            for (int j = 0; j < 10; j++) {
//                if (numbers[i] != numbers[j]) {
//                    variety.add(numbers[i]);
////                    break;
//                }
                if(!variety.contains(numbers[i])){
                    variety.add(numbers[i]);
//                }
            }
        }

        b.write(String.valueOf(variety.size()));
//        b.write(String.valueOf(diff));
        b.close();

    }
}








//
//            for(int j=0;j<10;j++){
//                for (int k=0;k<10;k++) {
//                    if(j==k){
//                        continue;
//                    }else{
//                        if(numbers[j]!=numbers[k]) {
//                            diff++;
//                        }
//                    }
//
//                }
//            }
//
//        b.write(String.valueOf(diff));
//        b.close();
//
//    }
//}



//바보짓을 너무 많이했다 너무 어렵게 생각했었다 단순한거였는데 쉽게 생각하고 쉽게 짜자 take it easy
