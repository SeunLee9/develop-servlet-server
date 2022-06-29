package study.weektwo.two;

public class Film extends Production{

    protected int boxOfficeGross;

    public Film(){}


    public Film(String t,String d,String w, int g){
        this.name = t;
        this.director = d;
        this.writer = w;
        this.boxOfficeGross = g;
    }

    public void display(){}


}
