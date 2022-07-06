package study.weekthree.c;

public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoCloseableObj obj = new AutoCloseableObj()){
            throw new Exception();
        } catch(Exception e0){
            System.out.println("예외부분입니다");
        }
    }
}
