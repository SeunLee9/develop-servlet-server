package baek;

import java.util.Scanner;

public class BOJ3046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int avg = scan.nextInt();
        int two = (2*avg - one);
        System.out.println(two);
    }
}
