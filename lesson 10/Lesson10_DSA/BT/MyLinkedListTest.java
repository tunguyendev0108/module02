package Lesson10_DSA.BT;
import Lesson10_DSA.TH.MyLinkedList;

import java.util.LinkedList;
public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);
        ll.addFirst(14);
        ll.addFirst(14);
        ll.addFirst(14);

        ll.add(4,0);
        ll.add(4,9);
        ll.printList();
    }
}
