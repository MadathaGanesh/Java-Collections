package Even_Numbers_Using_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // First take an arrayList and collect some random numbers
    // Use stream and .filter() method to get only even numbers as output



    public static void main(String[] args) {
        ArrayList<Integer> arrobj=new ArrayList<Integer>();
        arrobj.add(1);
        arrobj.add(2);
        arrobj.add(5);
        arrobj.add(4);
        arrobj.add(17);
        arrobj.add(15);
        arrobj.add(18);
        arrobj.add(10);
        arrobj.add(60);
        arrobj.add(89);

        System.out.println("Printing numbers normally : ");
        for (int i:arrobj) {
            System.out.println(i);
        }
        System.out.println();


        // Collecting and storing the data in streams
        List<Integer> streamobj=arrobj.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(" Printing only even numbers using streams : "+streamobj);
    }
}