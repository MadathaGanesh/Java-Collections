package List_Lambda_Expressions;

import java.util.ArrayList;
import java.util.List;

public class List_Lambda_Expressions {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<String>();
        obj.add("Ganesh");
        obj.add("Nani");
        obj.add("Sai");
        obj.add("Vinil");
        obj.add("Ranjith");
        obj.forEach((names)->{
            System.out.println("Names are : "+names);
        });
    }
}
