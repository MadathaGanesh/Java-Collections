package Apply_Method;

// Function interface is present in java.util.function package
// Introduced in java 8
// It contains only two arguments ; i.e; < T, R >
// T -> It represents which datatype value is giving as input
// r -> It represents which datatype value is producing as result or output
// Contains 4 methods : apply() , andThen() , compose() , identify()


/*
       apply() : It applies the function to the given input
 */

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Syntax :  Function<InputDatatype,OutputDatatype> objectname = variable -> operation


        Function<Integer,Double> objectname= x->x*2.5;  // Integer value is taken as input and Double value is given as output
        System.out.println("Result is displayed in Double dataype : " + objectname.apply(5));
        System.out.println();

        Function<Integer,Integer> intobj=y->y*y;
        System.out.println("Input and output both are integer datatype : "+intobj.apply(10));
        System.out.println();


        Function<String,Integer> strobj=z->z.length();
        System.out.println("String is input and integer is output : "+strobj.apply("I am Iron Man"));
        System.out.println();

        Function<String,String> strtotalobj=s->s.toUpperCase();
        System.out.println("String is input and string is output : "+strtotalobj.apply("I am Groot "));
        System.out.println();

    }
}