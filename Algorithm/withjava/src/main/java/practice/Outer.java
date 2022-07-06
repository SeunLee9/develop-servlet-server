package practice;

public class Outer {

    private int num = 10;

    private inner in;

    public Outer(){
        in = new inner();
    }

    class inner {

        int num2 = 11;

        public void method(){

        }

    }
}
