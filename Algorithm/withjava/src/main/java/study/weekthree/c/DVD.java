package study.weekthree.c;

public class DVD implements Playable {

    @Override
    public void Play(int select, String title){
        System.out.println("Title : " + title);
        System.out.println("1.DVD, 2.CD, 3.MP3 ------->" + select);
    }
}
