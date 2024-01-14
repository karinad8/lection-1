import java.util.Random;

public class Hours {
    public static void main(String[] args) {
        // надо создавать другую функцию, если код маленький ?
        Random random = new Random();
        int seconds = random.nextInt(28801);
        System.out.println(seconds);
        int hours = seconds / 3600;
        if (hours < 1) {
            System.out.println("Осталось меньше часа");
        }
        if (hours == 1) {
            System.out.println("Остался " + hours + " час");
        } else if (hours > 1 && hours < 5) {
            System.out.println("Осталось " + hours + " часа");
        } else if (hours >= 5) {
            System.out.println("Осталось " + hours + " часов");
        }
    }
}
