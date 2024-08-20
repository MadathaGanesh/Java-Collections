package Identity_method;

import java.util.function.Function;

// It will return the same value which we given as input to it .
// Given input and output values are same .

public class Main {
    public static void main(String[] args) {


        Function<Integer,Integer> obj=Function.identity();
        System.out.println(" Integer Data : "+obj.apply(10));

        Function<Double,Double> obj2=Function.identity();
        System.out.println(" Double Data : "+obj2.apply(29.34));

        Function<String,String> obj3=Function.identity();
        System.out.println(" String Data : "+obj3.apply("I am Groot"));

    }
}
