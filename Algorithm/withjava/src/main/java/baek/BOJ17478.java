package baek;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ17478 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer c = new StringTokenizer(a.readLine());
        int d = Integer.parseInt(c.nextToken());

        BOJ17478 BOJ17478 = new BOJ17478();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//        for(int i=0;i<d;i++) {

        BOJ17478.functionj(d,d);
//        }


        b.flush();
        b.close();

    }

    static void functionj(int a,int b){
        String line = getLine(a, b);

        printStart(line);

        if(a==1){
            for (int i = b;i>0;i--){
                System.out.print("____");
            }
            System.out.println("\"재귀함수가 뭔가요?\"");
            for (int i = b;i>0;i--){
                System.out.print("____");
            }
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            for (int i = b;i>0;i--){
                System.out.print("____");
            }
            System.out.println("라고 답변하였지.");
            return;
        }
        else{
            functionj(a-1, b);
        }
        System.out.print(line);
        System.out.println("라고 답변하였지.");

    }

    private static void printStart(String line) {
        System.out.println(line
                + "\"재귀함수가 뭔가요?\"\n"
                +line
                +"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.print(line);
        System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.print(line);
        System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
    }

    private static String getLine(int a, int b) {
        String line = "";
        for (int i = b - a; i>0; i--){
            line += "____";
        }
        return line;
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer c = new StringTokenizer(a.readLine());
//        int d = Integer.parseInt(c.nextToken());
//
//        BOJ17478 BOJ17478 = new BOJ17478();
//
//        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
////        for(int i=0;i<d;i++) {
//
//            BOJ17478.functionj(d,d);
////        }
//
//
//        b.flush();
//        b.close();
//
//    }
//
//    static void functionj(int a,int b){
//
//        for (int i = b-a;i>0;i--){
//            System.out.print("____");
//        }
//        System.out.println("\"재귀함수가 뭔가요?\"");
//        for (int i = b-a;i>0;i--){
//            System.out.print("____");
//        }
//        System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
//        for (int i = b-a;i>0;i--){
//            System.out.print("____");
//        }
//        System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
//        for (int i = b-a;i>0;i--){
//            System.out.print("____");
//        }
//        System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
//        if(a==1){
//            for (int i = b;i>0;i--){
//                System.out.print("____");
//            }
//            System.out.println("\"재귀함수가 뭔가요?\"");
//            for (int i = b;i>0;i--){
//                System.out.print("____");
//            }
//            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
//            for (int i = b;i>0;i--){
//                System.out.print("____");
//            }
//            System.out.println("라고 답변하였지.");
//        }
//        else{
//            functionj(a-1, b);
//        }
//        for (int i = b-a;i>0;i--){
//            System.out.print("____");
//        }
//        System.out.println("라고 답변하였지.");
//
//    }

//    private static void functionj(int a) throws IOException {
//        b.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
//        b.newLine();
//        b.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
//        b.newLine();
//        b.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
//        b.newLine();
//        for(int i=0;i<a;i++){
//            functionj(i);
////            if(i>0){
////            }
//
//        }
//        b.write("라고 답변하였지.");
//        b.newLine();
//    }


}

