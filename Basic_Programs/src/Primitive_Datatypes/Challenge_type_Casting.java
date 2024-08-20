package Primitive_Datatypes;

public class Challenge_type_Casting {
    public static void main(String[] args) {
        int num=100;
        byte num1=34;
        short num2=4;

        long longnum=1000*(num1+num2+num);
        System.out.println("Long Number is : "+longnum);

        short shortnum=(short) (1000*(num+num1+num2));
        System.out.println("Short number is : "+shortnum);


        long longSum =1000*(num+num1+num2);
        System.out.println(longSum);

        short shortsum = (short) (1000*(num+num1+num2));
        System.out.println(shortsum);
    }
}
