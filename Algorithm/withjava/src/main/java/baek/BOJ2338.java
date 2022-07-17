package baek;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ2338 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        BigInteger one = y.nextBigInteger();
        BigInteger two = y.nextBigInteger();

        System.out.println(one.add(two));
        System.out.println(one.subtract(two));
        System.out.println(one.multiply(two));
    }
}
