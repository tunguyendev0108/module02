package Lesson11_StackQueue.BT;
import java.util.Scanner;
import static Lesson11_StackQueue.BT.Bracket.checkBracket;
public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(checkBracket(str));
    }
}
