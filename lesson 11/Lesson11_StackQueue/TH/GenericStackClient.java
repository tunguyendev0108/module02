package Lesson11_StackQueue.TH;
import static Lesson11_StackQueue.TH.MyGenericStack.stackOfIStrings;
import static Lesson11_StackQueue.TH.MyGenericStack.stackOfIntegers;
public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
