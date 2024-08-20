import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    // LinkedHashSet Displays the data in the sequential order .
    // i.e; the data will be displayed in the same order in which it is taken as input
    public static void main(String[] args) {
        LinkedHashSet<String> obj=new LinkedHashSet<String>();
        obj.add("Ganesh");
        obj.add("Nani");
        obj.add("Ranjith");
        obj.add("Vinil");
        obj.add("Uday");
        obj.add("Sai");

        System.out.println("Displaying LinkedHashSet elments .........");
        Iterator<String> itr=obj.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}