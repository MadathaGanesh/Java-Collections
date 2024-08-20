package NumberFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3);  //asList() method converts the elements from Arrays format to List format
        List<Integer> list2= Arrays.asList(5,6,7);
        List<Integer> list3= Arrays.asList(8,9,0);

        List<List<Integer>> totalList=Arrays.asList(list1,list2,list3);   // Creating a nested List and storing all above three lists values in it

        List<Integer> listofAllIntegers = totalList.stream()
                .flatMap(x->x.stream())
                .collect(Collectors.toList());
        System.out.println("Elements of all sets are : ");
        System.out.println(listofAllIntegers);
    }
}