import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Java Comparable Interface is used to compare the objects of user-defined class
    // It has only compareTo(Object) method
    // It provides a single sorting sequence on the basis of single data member only .
    public static void main(String[] args) {
        ArrayList<Phone> Arr=new ArrayList<>();
        Arr.add(new Phone("Ganesh","33685"));
        Arr.add(new Phone("Nani","574793"));
        Arr.add(new Phone("Uday","657631"));
        Arr.add(new Phone("Sai","79164303"));
        Arr.add(new Phone("Vinil","9547613"));
        Arr.add(new Phone("Akhil","867113"));
        Arr.add(new Phone("Vishwas","687412"));
        Arr.add(new Phone("Ranjith","2413454"));

        System.out.println("Contact Names and Numbers before sorting ..........");
        for (Phone ob:Arr){
            System.out.println(ob.getContactName() + "  " + ob.getContactNumber());
        }

        System.out.println("**************************");
        System.out.println("Contact Names and Numbers after Sorting acc to ContactName ...............");
        Collections.sort(Arr);
        for (Phone sort1:Arr){
            System.out.println(sort1.getContactName() + "  " + sort1.getContactNumber());
        }



    }

}