package streams;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeSet1 {

    public static void main(String[] args) {

        findDuplicates("Word of the day!");
    }

    public static void findCharOccurrence(String str) {
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((c, n) ->
                        System.out.println("Char '" + c + "' count: " + n));
    }

    public static void removeDuplicates(String s) {
        String collect = s.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);
    }

    public static void findDuplicates(String s) {
        Set<Character> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(collect);

//                .map(String::valueOf)
//                .collect(Collectors.joining());


    }
}
