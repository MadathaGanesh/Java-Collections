import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Set<Integer> obj1=new HashSet<Integer>();
        obj1.addAll(Arrays.asList(new Integer[]{1,3,5,74,7,5,8,12,10}));
        System.out.println(" Set 1 elements are : "+obj1);

        Set<Integer> obj2=new HashSet<Integer>();
        obj2.addAll(Arrays.asList(new Integer[]{1,3,5,66,23,88,56,44,10,34,12}));
        System.out.println("\n Set 2 Elements are : " +obj2);


        System.out.println("\n Performing intersection operation ......");
        Set<Integer> intersection=new HashSet<Integer>(obj1);
        intersection.retainAll(obj2);
        System.out.println(intersection);


        System.out.println("\n Performing Union Operation .......");
        Set<Integer> union=new HashSet<Integer>(obj1);
        union.addAll(obj2);
        System.out.println(union);


        System.out.println("\n Performing difference operation (obj1-obj2)........ ");
        Set<Integer> difference=new HashSet<>(obj1);
        difference.removeAll(obj2);
        System.out.println(difference);


        System.out.println("\n Performing Difference operation (obj2-obj1)");
        Set<Integer> diff2=new HashSet<>(obj2);
        diff2.removeAll(obj1);
        System.out.println(diff2);
    }
}