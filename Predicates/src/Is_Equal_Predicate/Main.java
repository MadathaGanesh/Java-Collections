package Is_Equal_Predicate;

import java.util.function.Predicate;

// isEqual() method checks whether both the values are equal or not
// If both the values are equal means then it return true
// Otherwise it returns False .

public class Main {
    public static void main(String[] args) {
        Predicate<String> objectname=Predicate.isEqual("Ganesh Madatha");
        System.out.println(objectname.test("Ganesh Madatha"));
        System.out.println(objectname.test("Ganesh"));
        System.out.println(objectname.test("Madatha"));
        System.out.println(objectname.test("GaneshMadatha"));
    }
}
