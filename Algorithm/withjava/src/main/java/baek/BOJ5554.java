package baek;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int sum = a+b+c+d;

        System.out.println(sum/60);
        System.out.println(sum%60);
    }
}
