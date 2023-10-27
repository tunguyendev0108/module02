package Lesson11_StackQueue.BT;
import java.util.Scanner;
import static Lesson11_StackQueue.BT.checkPalindrome;
public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        checkPalindrome(s);
    }
}
