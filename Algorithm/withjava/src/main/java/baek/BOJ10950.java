package baek;

import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();

        for(int i=0;i<num;i++){
            int a = ss.nextInt();
            int b = ss.nextInt();
            System.out.println(a+b);
        }
    }
}
