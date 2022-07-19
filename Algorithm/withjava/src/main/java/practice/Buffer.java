package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //bufferedReader는 처음에 String으로 return값을 받음 buffer니깐
        //그냥적으면 Unhandled exception: java.io.IOException라고 IOException뜸
        //그래서 BufferedReader는 2가지가 필요하다
        //1.형변환 2.예외처리(예외처리는 try/catch문써도되고, throw IOException해도되는데 후자가 더 편하다 사실 문제푸는거니깐 IOException뜰일이 없기도하고

    }
}
