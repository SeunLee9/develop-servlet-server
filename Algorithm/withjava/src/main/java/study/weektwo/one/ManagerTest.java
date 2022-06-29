package study.weektwo.one;


public class ManagerTest {
    public static void main(String[] args) {

        Employee em = new Employee("Tom","Seoul",100000,123456);
        System.out.println(em.toString());
        System.out.println("name=" + em.name);
        System.out.println("address=" + em.address);
        System.out.println("salary=" + em.salary);

    }
}
