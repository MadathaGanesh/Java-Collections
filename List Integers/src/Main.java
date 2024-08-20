import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>();
        num.add(20);
        num.add(-14);
        num.add(30);
        num.add(43);
        num.add(12);
        num.add(2, 34);
        num.add(75);
        num.add(11);

        // Printing all the names in same order they have appeared using Iterator
        Iterator<Integer> iter1 = num.listIterator();
        System.out.println("Integer List elements in correct order are :");
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        // Sorting the elements
        System.out.println("Sorting the elements : ");
        Collections.sort(num);
        Iterator<Integer> sortnum=num.listIterator();
        while(sortnum.hasNext()){
            System.out.println(sortnum.next());
        }


        // Printing all numbers in reverse order
        System.out.println(" Integer List elements in reverse order :");
        Collections.reverse(num);
        Iterator<Integer> reveorder=num.listIterator();
        while(reveorder.hasNext()){
            System.out.println(reveorder.next());
        }


        // Copying one List Elements to another List
        System.out.println(" Copying one List elements to another List : " );
        List<Integer> copyobj=new ArrayList<>(num);
        Iterator<Integer> ob= copyobj.listIterator();
        while(ob.hasNext()){
            System.out.println(ob.next());
        }


        // Searching an element
        System.out.println("Searching for an element : ");
        int num1=Collections.binarySearch(num,30);
        System.out.println("element 30  found at index : "+num1);
        int num2=Collections.binarySearch(num,11);
        System.out.println("element 11  found at index : "+num2);
        int notnum=Collections.binarySearch(num,45);
        System.out.println(" Number which is not there is : " +notnum);
        int maxi=Collections.max(num);
        System.out.println("Maximum element is : "+maxi);
        int mini=Collections.min(num);
        System.out.println("Minimum element is : "+mini);

        System.out.println("*************");
        // Creating a parent LinkedList
        LinkedList<Integer> link1=new LinkedList<>();
        link1.add(39);
        link1.add(25);
        link1.add(48);
        link1.add(33);
        link1.add(53);
        link1.addFirst(01);
        link1.addLast(88);
        Iterator<Integer> iter4= link1.listIterator();
        while (iter4.hasNext()){
            System.out.println("LinkedList elements are : " +iter4.next());
        }

        System.out.println(" Creating a subList of LinkedList : ");
        LinkedList<Integer> sublist=new LinkedList<>();
        sublist.add(25);
        sublist.add(48);
        int sublistindex=Collections.indexOfSubList(link1,sublist);
        System.out.println("Sublist starting index found at : "+sublistindex);
        // If we given in wrong order or if the elements is not there in parent list then it returns Garbage Value
        LinkedList<Integer> wrongSub=new LinkedList<>();
        wrongSub.add(55);



    }
}
