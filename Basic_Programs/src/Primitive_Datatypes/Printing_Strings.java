package Primitive_Datatypes;

public class Printing_Strings {
    public static void main(String[] args) {
        String name=" I am Ganesh";
        String age="My age is 21";
        String address="I am from Warangal";

        String fulladdress=name+" "+age + " " + " "+address;
        System.out.println("Full address is : "+fulladdress);

        int myint=100;
        age=age+myint;
        System.out.println(age);
        String myint1="100";
        String myint2="200";
        System.out.println(myint1+myint2);

        int int1=24;
        double double1=239.34;
        System.out.println(myint1+myint2+int1+double1);
    }
}
