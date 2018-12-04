import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RepeatedCharacters {
    private static Map repeatedCound(String s){
       return s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
    }

    public static boolean containsRepeated(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "java";
        System.out.println(containsRepeated(s));
        Map result = repeatedCound(s);
        System.out.println(Arrays.asList(result));

    }
}
