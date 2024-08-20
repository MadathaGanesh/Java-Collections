package FlatMap_Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Creating a list of Strings
        List<String> listobj= Arrays.asList("1.0","5.4","8.9","3.5","9.6","5.6","9.8");

        // Using Stream flatMap(Function mapper)
        listobj.stream().flatMap(num->Stream.of(num)).
        forEach(System.out::println);
    }
}
