package study.weekthree.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaPlayer {



    public void playAll() throws IOException {

//        int num = System.in.read();
////        아스키코드로 숫자를 입력

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int items[] = new int[num];


        System.out.println("Number of items :" + items.length);

        ArrayList cds = new ArrayList<>();
        ArrayList dvds = new ArrayList<>();
        ArrayList mp3s = new ArrayList<>();

        for(int i=0; i<num; i++){
            String title = sc.next();
            int select = sc.nextInt();

            if(select == 1){
                CD cd = new CD();
                cd.Play(select,title);
                cds.add(title);

            }
            if(select == 2){
                DVD dvd = new DVD();
                dvd.Play(select,title);
                dvds.add(title);
            }
            if(select == 3){
                MP3 mp3 = new MP3();
                mp3.Play(select,title);
                mp3s.add(title);
            }



////            System.out.println(i);
//            //int select = System.in.read();
////            System.out.println(select);
//            String st;
////            Scanner sc = new Scanner(System.in);
//            st = sc.nextLine();
//            System.out.println(CD + st);
        }
        System.out.println("ALL items loaded");
        System.out.println("DVD:playing" + dvds);
        System.out.println("CD:playing" + cds);
        System.out.println("MP3:playing" + mp3s);

//        for(int i=0; i<num; i++){
//            dvds.get(i);
//            cds.get(i);
//            mp3s.get(i);
//        }

    }




//    for(int i : arr){
//        1:DVD,2:CD,3:MP3------> 입력값입력하는거
//        Title : 타이틀입력
//
//        if(선택 == DVD){
//
//        }
//    }


    public static void main(String[] args) throws IOException {
        MediaPlayer player = new MediaPlayer();
        player.playAll();
    }



}
