package GraceMarks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Adding Grace marks for student marks , we are adding 10 extra marks for all the students who all wrote the exam ...

public class Marks {
    public static void main(String[] args) {
        ArrayList<Integer> arrobj=new ArrayList<Integer>();
        arrobj.add(30);
        arrobj.add(86);
        arrobj.add(56);
        arrobj.add(68);
        arrobj.add(27);
        arrobj.add(39);
        arrobj.add(62);
        System.out.println("Marks before adding 10 Grace Marks : "+arrobj);


        List<Integer> lisobj=arrobj.stream()
                .map(x->x+10)
                .collect(Collectors.toList());
        System.out.println("Marks after adding 10 Grace Marks , New marks is : "+lisobj);
    }
}
