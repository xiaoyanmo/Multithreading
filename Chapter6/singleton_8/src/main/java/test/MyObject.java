package test;


public class MyObject {

    private static MyObject instance;

    private MyObject() {
    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }

}
