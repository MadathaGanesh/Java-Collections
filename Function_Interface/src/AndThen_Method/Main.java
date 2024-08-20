package AndThen_Method;

/*
 andthen() method : It returns a composed function that first applies this function to its input,
 and then applies the after function to the result.
  If evaluation of either function throws an exception, it is received to the caller of the composed function.
 */

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Double> obj=x-> (double) (x*5);

        obj=obj.andThen(x->x*10);
        System.out.println("After applying andthen() function : "+obj.apply(3));



        // Another second one

        Function<Integer,Double> obj2=a->a/2.0;
        try {
            obj2 = obj.andThen(null);
            System.out.println("result value is : "+obj2);
        }catch (Exception ex){
            System.out.println("Exception occurs : "+ex);
        }
    }
}
