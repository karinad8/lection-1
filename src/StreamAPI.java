import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamAPI {
        public static void main(String[] args) {

            List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
            System.out.print("Сортировка по возрастанию цифр: \n" );
            myList.stream()
                    .sorted(Comparator.comparingInt(s -> Integer.valueOf(s.substring(1))))
                    .forEach(System.out::println);

            Collections.sort(myList, Collections.reverseOrder());
            System.out.println("Сортировка по убыванию букв: " + myList);

            List<String> filteredList = myList.stream()
                    .filter(object -> !object.matches("[abc]3"))
                    .skip(1)
                    .limit(4)
                    .map(String::toUpperCase)
                    .toList();
            System.out.println(filteredList);

            System.out.println("Number of remaining elements : " + filteredList.stream().count());
        }
    }

