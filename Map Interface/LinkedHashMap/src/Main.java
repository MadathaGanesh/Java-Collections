import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String > obj=new LinkedHashMap<Integer,String >();
        obj.put(1,"Ganesh");
        obj.put(2,"Nani");
        obj.put(3,"Ranjith");
        obj.put(4,"Uday");
        obj.put(5,"Vishwas");

        System.out.println("Using LinkedHashset printing data in sequence order .....");
        Iterator i=obj.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n Using another method to print data in sequence order ....... ");
        Set set=obj.entrySet();
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("Printing only keys ......... "+obj.keySet());

        System.out.println("PRINTING only values ...... "+obj.values());


    }
}