package test_Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Syntax : Predicate<Datatype> objectname = variableName->( Condition )
        Predicate<Integer> objectname=x->(x>10);
        System.out.println(objectname.test(200));   // Calling the test() method of Predicate
        System.out.println(objectname.test(8));
    }
}