import LinkedList.JayLinkedList;
import Recursion.FactorialByJay;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(new FactorialByJay().run(3));
        List list = new <String>JayLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        int i = 0;
       while (i<list.size()){
            System.out.println(list.get(i));
            i++;
       }
    }
}
