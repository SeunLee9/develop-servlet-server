package baek;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0;
        for(int i=0;i<n+1;i++){
            num += i;
        }
        System.out.println(num);
    }
}
