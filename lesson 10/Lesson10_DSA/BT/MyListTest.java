package Lesson10_DSA.BT;
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        list.remove(2);
        list.printList();

        System.out.println(list.size());

        list.printList();
        System.out.println(list.get(2));
    }
}
