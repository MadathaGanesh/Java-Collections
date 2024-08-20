import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    // It will display the elements in sorted ascending order
    public static void main(String[] args) {
        TreeMap<Integer,String> obj=new TreeMap<Integer,String>();
        obj.put(5,"Ganesh");
        obj.put(3,"Rakesh");
        obj.put(6,"Shiva");
        obj.put(2,"Sai");
        obj.put(1,"Uday");
        obj.put(8,"Ramp");
        obj.put(7,"Ravi");

        System.out.println("Displaying the TreeMap elements with ' Key Integer datatype' and ' Value String Datatype ' .... ");
        Iterator itr=obj.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        TreeMap<String ,String > obj2=new TreeMap<String,String>();
        obj2.put("Hello","Ganesh");
        obj2.put("by","Sai");
        obj2.put("hii","Ram");
        obj2.put("Bye","Krishna");
        obj2.put("Hii","ravi");

        System.out.println("\n Displaying the TreeMap elements with ' Key String datatype' and ' Value String Datatype ' .... ");
        Iterator itr2=obj2.entrySet().iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}