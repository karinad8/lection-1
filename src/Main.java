import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задание : найти сумму цифр ab + cd числа abcd

        // отсканироват число
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        //перевести в строку
        String numberStr = String.valueOf(number);
        //отрезать первую половину строки, потом отрезать вторую часть строки
        String fpart  = numberStr.substring(0, 2 );
        String spart  = numberStr.substring(2);
        // перевести их  обратно в числа int
        int fhalfInt = Integer.parseInt(fpart);
        int shalfInt = Integer.parseInt(spart);
        // сложить
        int x = fhalfInt + shalfInt;
        // вывести
        System.out.println("Sum is " + x );
    }
}