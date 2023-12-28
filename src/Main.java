import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // объявить число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        // конвертитровать число в строку
        String numberStr = String.valueOf(number);
        // взять из этой строки последнее число
        int numberStrLenght = numberStr.length();
        String lastNr = numberStr.substring( numberStrLenght - 1);
        // вывести число
        System.out.println("Last digit : " + lastNr);
    }
}