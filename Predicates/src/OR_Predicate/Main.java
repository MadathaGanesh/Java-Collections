package OR_Predicate;

import java.util.function.Predicate;

// It is like Logical OR - Operator ,
// If any one of  codition is True , then it returns True
// If both the conditions are false means then the result is false .

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> object1= x->(x==20);
        Predicate<Integer> object2=y->(y>10);
        System.out.println("Both conditions are TRUE : Using OR() Predicate :   " + object1.or(object2).test(45));
        System.out.println("ONly One Condition is TRUE : Using OR() Predicate : "+object2.or(object1).test(6));
        System.out.println("ONly One Condition is TRUE : Using OR() Predicate : "+object2.or(object1).test(-20));

    }
}
