package study.weekthree.c;

public class CD implements Playable {

    @Override
    public void Play(int select, String title){
        System.out.println("Title : " + title);
        System.out.println("1.DVD, 2.CD, 3.MP3 ------->" + select);
    }
//    CD CD(){
        //'CD()' in 'study.weekthree.c.CD' clashes with 'CD()' in 'study.weekthree.c.Playable'; attempting to assign weaker access privileges ('package-private'); was 'public'
//    }



}
