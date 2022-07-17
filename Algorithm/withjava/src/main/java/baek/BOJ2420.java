package baek;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger houston = scanner.nextBigInteger();
        BigInteger malibu = scanner.nextBigInteger();
        BigInteger hawaii = houston.subtract(malibu);

        System.out.println(hawaii.abs());
    }
}
