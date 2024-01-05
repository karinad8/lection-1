package hometasks;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        //Напишите программу для учета средней оценки студента.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int numberOfSub = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numberOfSub; i++) {
            System.out.println("Enter the mark : " + (i + 1));
            int mark = scanner.nextInt();
            if (mark < 11) {
                sum = mark + sum;
                System.out.println(sum);
            }
            if (mark > 10) {
                System.out.println("Start again. Please enter your marks correctly! From 1 to 10");
                return;
            }
        }
        double averageDouble = (double) sum / numberOfSub;
        System.out.println("Average is" + " " + averageDouble);

    }
}
