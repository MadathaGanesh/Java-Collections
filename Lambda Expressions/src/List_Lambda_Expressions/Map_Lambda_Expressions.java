package List_Lambda_Expressions;

import java.util.HashMap;
import java.util.Map;

public class Map_Lambda_Expressions {
    public static void main(String[] args) {
        Map<Integer,String> obj=new HashMap<Integer,String>();
        obj.put(1,"Ganesh");
        obj.put(2,"Vinay");
        obj.put(3,"Nani");
        obj.put(4,"Pranay");
        obj.put(5,"Nithin");

        obj.forEach(
                (keys,values)->{
            System.out.println("Keys are :"+keys);
            System.out.println("Values of " + keys + " is : " +values);
        });
    }
}
