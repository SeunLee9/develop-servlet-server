package baek;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner step = new Scanner(System.in);
        int bigstep = step.nextInt();
        for (int i=0;i<bigstep;i++){
            for(int j=0;j<i+1;j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
