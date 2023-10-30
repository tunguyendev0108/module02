package LinearEquationResolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Réolver");
        System.out.println("Given a equation á 'a * x + b = 0', please");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0){
    double solution = -b/a;
        }
    }
}
