package Lesson03_Array;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println();
            }
        } while (size > 30) ;
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student" + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int k : array) {
            System.out.print(k + "\t");
            if (k >= 5 && k <= 10) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is: " + count);
    }
}