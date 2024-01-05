package tasks;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Определить является ли целое число чётным либо нечётным
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        isNumberOddOrEven(number);
    }

    public static void isNumberOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println(" The number is odd");
        }
    }
}



