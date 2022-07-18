package baek;

import java.util.Scanner;

public class BOJ4299 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int sub = scan.nextInt();
        int first = (sum+sub)/2;
        int second = sum-first;

        System.out.println(first + " " + second);
    }
    //이렇게하면 너무 하드코딩임 다시 고칠것
    //그냥 틀렸네
}
