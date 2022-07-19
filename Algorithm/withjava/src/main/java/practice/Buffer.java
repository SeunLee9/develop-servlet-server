package practice;

import java.io.*;
import java.util.StringTokenizer;

public class Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //bufferedReader는 처음에 String으로 return값을 받음 buffer니깐
        //그냥적으면 Unhandled exception: java.io.IOException라고 IOException뜸
        //그래서 BufferedReader는 2가지가 필요하다
        //1.형변환 2.예외처리(예외처리는 try/catch문써도되고, throw IOException해도되는데 후자가 더 편하다 사실 문제푸는거니깐 IOException뜰일이 없기도하고

        //StringTokenizer를 쓰는이유?
        //위처럼 문자열을 받을건데 문자열을 어떻게 처리할건가? 입력값이 3 2 7이였다면? "3 2 7"이 되는데?
        //그걸 문자(혹은 문자열)로 나누기 위해서 StringTokenizer class를 쓰는거다
        StringTokenizer token = new StringTokenizer(s);
        StringTokenizer tokena = new StringTokenizer(br.readLine());
        int numw = Integer.parseInt(token.nextToken());
        //여기까지 정리하면
        //System.in, 입력값으로 InputStreamReader을 만들고
        //그걸로 BufferedReader를 만든다
        //그리고 그 String을 br에 할당하고
        //br을 읽은걸로 StringTokenizer를 생성하고 token에 할당한다
        ////그리고 이젠 Scanner랑 비슷하다
        //token에 있는걸 하나씩 읽는다 
        //그리고 int로 형변환


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(numw);
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
