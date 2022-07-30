package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Practiceb {

//    Practicea.inner variablei = new Practicea.inner();
    // inner가 static이 아니라면 'practice.Practicea' is not an enclosing class

//    variablei.



//    test class 니깐 test.sum(c)하면 될것같은데?

//    long sum(int[] a){
//        int total =0;
//        for(int i=0;a.length;i++){
//            total += a[i];
//        }
//        return total;
//    }
public static void main(String[] args) {
//    int[] d = {5, 6, 7 ,8, 9};
//    int a = Arrays.stream(d).max().getAsInt();
//    System.out.println(a);

//    int[] e = {5, 6, 7, 8, 9};
//    e[2] ++;
//    System.out.println(e[2]);

//    int a = 32;
//    int b = 0;
//    b = a-45;
//    a = a+b;
//    int c = 400;
//    int d = c%4;

//    int c = 125;
//
//    System.out.println(c/60);


    //컨트롤+. 숨기기

//    String str = "hello";
//    String[] arr = str.split("");

//    double s = 540.156456;
//    double l = Math.round(s * 100)/(100);
//    double t = (double)Math.round(s*10000)/10000;
//    System.out.println(t);

//    int first = 5;
//    int d = 3017;
//    int second = 2;
//    int sum = 0;
////    while(d>0){
//        first = d/10%10;
//
////    }
//    first = d/10%10;
//    second = d%10;
////    first+second = sum;
//    System.out.println(second);

//    int d = 26;
//    int first = 0;
//    int second = 0;
//    int sum = 0;
//    int sumsec = 0;
//    int fin = 0;
//    int count = 0;
//    while(d!=fin){
//        first = d/10%10; //2
//        second = d%10; //6
//        sum = first+second; //8
//        sumsec = sum%10; //8
//        fin = second*10 + sumsec; // 60  8 //68
//        //아 2번째부터도 처음꺼만 반복해서 그렇구나
//        if(d==fin){
//            break;
//        }
//        count++;
//    }
//
//    System.out.println(count);



//    int d = 26;
//    int first = 0;
//    int second = 0;
//    int sum = 0;
//    int sumsec = 0;
//    int fin = 0;
//    int count = 0;
//
//    while(fin!=d){
//        if(count==0) {
//            first = d / 10 % 10; //2
//            second = d % 10; //6
//        }else{
//            first = fin / 10 % 10;
//            second = fin / 10;
//        }
//
//       sum = first+second; //8
//        sumsec = sum%10; //8
//        fin = second*10 + sumsec; // 60  8 //68
//        if(fin==d){
//            break;
//        }else {
//            count++;
//        }
//    }
//
//    System.out.println(count);


//    int count = 10;
//    while(count>8){
//        count--;
//    }
//    System.out.println(count);


//    String a = "apple";
//    String[] b = a.split("");
//    System.out.println(b[3]);


////    int[] f = {2,2,3,3,4,4,4};
////    int g = Arrays.stream(f).max().getAsInt();
//////    int i = Collections.frequency(f,"g");
////    int h = Arrays.stream(f).min().getAsInt();
//////    System.out.println(g);
//////    System.out.println(h);
//////    f = f.
//    ArrayList<Integer> cnt = new ArrayList<>();
////    for(int i=0;i<f.length;i++){
////        cnt.add(f[i]);
////        }
//////    cnt.remove();
//
//    String[] ss = new String[3];
//    ss = new String[]{"aaaa", "aaaaaaa", "aaaaaaaaa"};
//
//    System.out.println(ss[2].length());
////    System.out.println(ss[2].);
////    cnt.

//    int[] count = {1, 2, 3, 3};
//    int max = Arrays.stream(count).max().getAsInt();
//    long maxcount = Arrays.stream(count).max().
//    System.out.println(maxcount);

    //유용했음
//    ArrayList<String> a = new ArrayList<>();
//    a.add("String");
//    a.add("docker");
//    String b = a.get(0);
//
//    System.out.println(a.get(1).charAt(3));
    //for (이걸로 전체 묶어줘야함 인자값 받는게 여러개였네 마지막에 if (0 0 0 0 입력받으면 break; 그리고 for문 밖에서 b.close();)
    double d = 50;
    double e = 5;
    double f = 3;
    double g = 14*0.01*e;
    int count = 0;
    double goal = 0;

    while(true){
        goal += e; //goal = 1 // 4.7
        e -= g; //e = 0.99
//        e = Double.parseDouble(String.format("%.2f",e));
        goal -= f; // goal = 0
        count ++; //1
        System.out.println(goal);
//        System.out.println(e);
//        System.out.println(count);
        if(goal>d){
//            System.out.println(goal);
//            b.write(String.valueOf(goal));
            System.out.println(count-1);
            break;
        }
        if(goal<0.0){
            System.out.println(count);
            System.out.println("failed");
            break;
        }
//            b.write(count);

    }
    }

}
