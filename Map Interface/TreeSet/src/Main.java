import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    // The first Priority goes to Capital Alphabets and the second Priority goes to Small Alphabets ......
    public static void main(String[] args) {
        TreeSet<String> obj=new TreeSet<String >();
        obj.add("Hello");
        obj.add("Ganesh");
        obj.add("I");
        obj.add("Am");
        obj.add("jarvis");

        System.out.println("Displaying the Treeset elements in Alphabetical Order ..");
        Iterator itr=obj.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}