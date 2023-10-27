package Lesson11_StackQueue.BT;
import java.util.Scanner;
import static Lesson11_StackQueue.BT.binaryToDecinal;
import static Lesson11_StackQueue.BT.dicimalToBinary;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Dicimal number: ");
        int number = scanner.nextInt();
        dicimalToBinary(number);
        System.out.print("\nEnter Binary number: ");
        int num = scanner.nextInt();
        binaryToDecimal(num);
    }
}
