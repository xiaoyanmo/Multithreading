package mylist;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data) {
        System.out.println(Thread.currentThread().getName() + " 线程进入实例属性对象的add方法" + "\t" + System.identityHashCode(list));
        list.add(data);
    }

    synchronized public int getSize() {
        System.out.println(Thread.currentThread().getName() + " 线程进入实例属性对象的getSize方法" + "\t" + System.identityHashCode(list));
        return list.size();
    }

}
