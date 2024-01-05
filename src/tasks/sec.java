package tasks;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sec {
    public static void main(String[] args) {
        // Напишите программу, которая будет переводить секунды в форматированный вид
        // - сутки, часы, минуты, секунды учитывая окончания слов
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printDate(a);


    }
    public static void printDate (int seconds) {
        int day = seconds / ( 60*60*24);
        int hour = (seconds/ (60 * 60)) % 24;
        int min = (seconds/60) % 60;
        int sec = seconds % 60;
        if (day != 1) {
            if (day != 0) {
            System.out.print(day + "days"); }
            else {
                System.out.println(day + "day");
            }
        }
        if (hour != 0) {
            System.out.print(hour + "hours");
        }
        if (min!=0) {
            System.out.print(hour + "minutes");
        }
        if (sec != 0) {
            System.out.print(hour + "seconds");
        }
    }
}
