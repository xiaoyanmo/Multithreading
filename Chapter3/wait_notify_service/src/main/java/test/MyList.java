package test;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    volatile private List list = new ArrayList();

    public void add() {
        list.add("anyString");
    }

    public int size() {
        return list.size();
    }

}