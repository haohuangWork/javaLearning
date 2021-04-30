package jvm;

/**
 * @author huanghao
 */
public class StaticDispatch {

    static class Human {

    }

    static class Man extends Human {
    }
    static class Woman extends Human {
    }

    public static void sayHello(Woman woman) {
        System.out.println("hello woman");
    }
    public static void sayHello(Human human) {
        System.out.println("hello human");
    }

    public static void sayHello(Man man) {
        System.out.println("hello gentlemen");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        sayHello(man);
        sayHello(woman);
    }
}
