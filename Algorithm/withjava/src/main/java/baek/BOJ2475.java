package baek;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int s = (int)Math.pow(first.nextInt(),2);
        int d = (int)Math.pow(first.nextInt(),2);
        int f = (int)Math.pow(first.nextInt(),2);
        int g = (int)Math.pow(first.nextInt(),2);
        int h = (int)Math.pow(first.nextInt(),2);
        int j = s+d+f+g+h;

        System.out.println(j%10);
    }
    //지금건 너무 비효율적임
}
