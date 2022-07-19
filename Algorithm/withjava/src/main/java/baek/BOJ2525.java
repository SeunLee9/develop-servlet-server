package baek;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int minuteman = n.nextInt();
        int seconds = n.nextInt();
        int inputvalue = n.nextInt();

        int sum = minuteman*60+seconds+inputvalue;
        if(sum>=1440){
            int hour = (sum-1440)/60;
        }else{
            int hour = sum/60;
        }
        int minute = sum%60;

        System.out.println((sum/60)+" "+(sum%60));


    }
}
