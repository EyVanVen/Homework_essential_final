package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList <>(10);

        MyDictionary dict = new MyDictionary();
        dict.coupleMaker(5, "Fly", list);
        dict.coupleMaker(2, "Gregory", list);
        dict.coupleMaker(10, "Doppio", list);

        System.out.println(dict.getIndex(2, list));

        System.out.println(dict.getCoupleNum(list));
    }
}
