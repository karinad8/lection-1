package hometasks;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        //Напишите программу для учета средней оценки студента.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int numberOfSub = scanner.nextInt();
        int i, sum = 0;
        for (i = 0; i < numberOfSub; i++) {
            Scanner scannerNr = new Scanner(System.in);
            System.out.println("Enter the mark : " + (i + 1));
            int mark = scannerNr.nextInt();
            if (mark < 11) {
                sum = mark + sum;
                System.out.println(sum);
            }
            if (mark > 10) {
                System.out.println("Start again. Please enter your marks correctly! From 1 to 10");
                break;
            }
        }
        if (i != 0) {
            int average = sum / (i);
            System.out.println("Average is" + " " + average);
        } else {
            System.out.println("Average is unavailable");

        }
    }
}


