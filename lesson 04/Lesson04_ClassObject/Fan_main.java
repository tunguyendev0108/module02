package Lesson04_ClassObject;

public class Fan_main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println(fan2);
    }
}