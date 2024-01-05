package tasks;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        // Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ender the day : ");
        int dateDay = scanner.nextInt();
        int dateMonth = scanner.nextInt();
        int dateYear = scanner.nextInt();
        printNextDay(dateDay, dateMonth, dateYear);

    }

    public static void printNextDay(int dateDay, int dateMonth, int dateYear) {
        if (dateDay > 29) {
            dateMonth++;
            dateDay = 1;
        } else {
            dateDay = dateDay + 1;
        }
        if (dateMonth > 11) {
            dateMonth = 1;
            dateYear++;
        }
        System.out.println("The next day : " + dateDay + " " + dateMonth + " " + dateYear);
    }

}
