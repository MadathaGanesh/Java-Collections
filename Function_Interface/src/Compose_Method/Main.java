package Compose_Method;

import java.util.function.Function;

/*
   It Returns a composed function that first applies the before function to its input,
   and then applies this function to the result. If evaluation of either function throws an exception,
   it is relayed to the caller of the composed function.
 */

public class Main {
    public static void main(String[] args) {

        Function<Integer,Double> obj= a->a/2.0;
        obj=obj.compose(a->a*5);
        System.out.println("After using compose method : "+obj.apply(6));


        // Using try , catch and exception

        Function<Integer,Integer> obj2=x->x*6;
        try{
            obj2.compose(null);
            System.out.println("result is : "+obj2);
        }catch (Exception ex){
            System.out.println("Exception occurs : "+ex);
        }
    }
}
