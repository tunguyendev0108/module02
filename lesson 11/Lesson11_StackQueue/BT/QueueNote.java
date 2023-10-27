package Lesson11_StackQueue.BT;

//A Linked list node to store a queue entry
public class QueueNote {
    int key;
    QueueNote next;

    public QueueNote(int key) {
        this.key = key;
        this.next = null;
    }
}