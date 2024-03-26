import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        System.out.print("Сортировка по возрастанию цифр: \n");
        List<String> sortedList = myList.stream()
                .sorted(Comparator.comparingInt(s -> Integer.valueOf(s.substring(1))))
                .toList();
        System.out.println(sortedList);

        Collections.sort(myList, Collections.reverseOrder());
        System.out.println("Сортировка по убыванию букв: " + myList);

        List<String> filteredList = sortedList.stream()
                .filter(object -> !object.matches("[abc]3"))
                .skip(1)
                .limit(sortedList.size())
                .map(String::toUpperCase)
                .toList();
        System.out.println(filteredList);

        System.out.println("Number of remaining elements : " + filteredList.stream().count());
    }
}

