package And_Predicate;

import java.util.function.Predicate;

public class Main {
    // It will return True , if both the conditions are true means
    // It will return False , if any one of the condition is false means .
    public static void main(String[] args) {

        Predicate<Integer> objectname=x->(x>10);   // Creating first object and creating first condition ....
        Predicate<Integer> objectname2=x->(x<75);  // Creating Second object and creating Second condition ....
        System.out.println(" Result is : "+objectname.and(objectname2).test(20));   // Checking whether they are satisfying both conditions or nou using AND Operation .
        System.out.println(" Result is : "+objectname.and(objectname2).test(2));   // Checking whether they are satisfying both conditions or nou using AND Operation .

    }
}
