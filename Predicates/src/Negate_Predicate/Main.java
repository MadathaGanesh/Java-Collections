package Negate_Predicate;

import java.util.function.Predicate;

// Negate() function return true if the actual result is false
//       and it will return false if the actual result is true .

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> ObjectName=x->(x>49);
        System.out.println("Negate() function  actual result is False , But Negate() result is : " + ObjectName.negate().test(20));
        System.out.println("Negate() function  actual result is True , But Negate() result is : " + ObjectName.negate().test(60));


    }
}
