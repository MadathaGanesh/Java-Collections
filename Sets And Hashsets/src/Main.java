import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> obj=new HashSet<String>();
        obj.add("I");
        obj.add("am");
        obj.add("from");
        obj.add("Warangal");
        obj.add("Telangana");

        System.out.println("Printing all Set  values in one Line ...");
        System.out.println(obj);

        System.out.println("\n Using size() method : " +obj.size());


        obj.remove("from");
        System.out.println("\n Printing all set values one after another. after using remove() method");
        Iterator<String> itr= obj.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n Using size() method : " +obj.size());

        System.out.println("\n Using contains() method ..... ");
        if (obj.contains("am")) System.out.println("Am word is there in Set");
        else System.out.println("Am word is not there");

        System.out.println("\n hashcode() method .....");
        System.out.println(obj.hashCode());

        System.out.println("\n isempty() method.......");
        if (obj.isEmpty()) System.out.println("Set is empty ");
        else System.out.println("Set is not empty");

        System.out.println("\n printing set values in  the form of Array using toarray() method..........");
        obj.toArray();
        System.out.println(obj);

    }
}