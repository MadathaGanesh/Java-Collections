package String_FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listobj= Arrays.asList("Vikram","Jawan","Kaidhi","Jersey","Original Ghost");

        System.out.println("Using Stream FlatMap we can access only 2nd character of each word ....");
        listobj.stream().flatMap(str-> Stream.of(str.charAt(2))).
                forEach(System.out::println);
    }
}
