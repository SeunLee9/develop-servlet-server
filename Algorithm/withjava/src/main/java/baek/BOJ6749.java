package baek;

import java.util.Scanner;

public class BOJ6749 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        int abs = Math.abs(one-two);
        System.out.println(two+abs);
    }
}
