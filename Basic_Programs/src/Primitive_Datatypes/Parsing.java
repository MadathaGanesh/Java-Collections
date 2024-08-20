package Primitive_Datatypes;

public class Parsing {
    public static void main(String[] args) {
        String num="239";
        Integer intnum=Integer.parseInt(num);
        System.out.println("Parsing Integer Number : "+intnum);
        Double doubleint=Double.parseDouble(num);
        System.out.println("Parsing Double value :"+doubleint);
        intnum+=100;
        System.out.println("After adding 100 : "+intnum);
    }
}
