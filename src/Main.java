import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры
    /*int number = scanner();
    int factorial = calculateFactorial(number);
    System.out.println("Factorial is " + factorial);*/
        // В американской армии считается несчастливым число 13, а в японской - 4.
        // Перед международными учениями штаб армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040),
        // чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999,
        // то сколько всего номеров придётся исключить?

    }

    public static int scanner () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }
}



