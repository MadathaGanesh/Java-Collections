package Primitive_Datatypes;

public class Main {
    public static void main(String[] args) {
        int max_Range=Integer.MAX_VALUE;
        int min_Values=Integer.MIN_VALUE;

        long maxRange=Long.MAX_VALUE;
        long minRange=Long.MIN_VALUE;

        short maxRange1=Short.MAX_VALUE;
        short minRang1=Short.MIN_VALUE;

        double maxRange2=Double.MAX_VALUE;
        double minRange2=Double.MIN_VALUE;

        float maxValue3=Float.MAX_VALUE;
        float minvalue3=Float.MIN_VALUE;

        System.out.println("Integer Max Range : "+max_Range);
        System.out.println("Integer Min Range : "+min_Values);
        System.out.println("Long Max Range : "+maxRange);
        System.out.println("Long min Range : "+minRange);
        System.out.println("Short Max Range : "+maxRange1);
        System.out.println("Short min Range : "+minRang1);
        System.out.println("Double Max Range : "+maxRange2);
        System.out.println("Double Min Range :" +minRange2);
        System.out.println("Float Max range :"+maxValue3);
        System.out.println("Float Min Range : "+minvalue3);

        // typecasting
        double num=239.4543;
        int val=(int) (num);
        System.out.println("Double value is : "+num);
        System.out.println("Integer value is : "+val);


    }
}