package baek;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ1271 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        Scanner s2 = new Scanner(System.in);
//        System.out.println(s*s2);
        //입력값받은거 재할당해주는거 까먹음


//        Scanner s = new Scanner(System.in);
//        int first = s.nextInt();
//        int second = s.nextInt();
//
//        System.out.println(first/second);
//        System.out.println(first%second);
        //문제 조건을 대충 읽었다 int는 2*10^9 정도까지밖에 표현하지못함 타입체크 잘하자

        Scanner s = new Scanner(System.in);
        BigInteger first = s.nextBigInteger();
        BigInteger second = s.nextBigInteger();
        System.out.println(first.divide(second));
        System.out.println(first.remainder(second));



    }
}
