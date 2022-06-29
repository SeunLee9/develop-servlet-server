package study.weektwo.two;

public class Play extends Production {

    protected int performances;

    public Play(){}

    public Play(String t,String d,String w,int p){
        this.name = t;
        this.director = d;
        this.writer = w;
        this.performances = p;
    }

    public void display(){}
}
