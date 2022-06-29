package study.weektwo.two;


public class Entertainment {
    public static void main(String[] args) {

        Film fm = new Film("Titanic","James Cameron","James Cameron", 2234);
        Play pp = new Play("Bus Stop", "Harnold Clurman", "William Inge", 478);
        System.out.println("Title:      : " + fm.name);
        System.out.println("Director    : " + fm.director);
        System.out.println("ScreenWriter: " + fm.writer);
        System.out.println("Total gross : $" + fm.boxOfficeGross + "million");
        System.out.println();
        System.out.println("Title:      : " + pp.name);
        System.out.println("Director    : " + pp.director);
        System.out.println("Playwright  : " + pp.writer);
        System.out.println("Performances: " + pp.performances);

    }
}
