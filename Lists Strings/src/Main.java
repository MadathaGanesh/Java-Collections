import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Ganesh");
        names.add("Nani");
        names.add("Akhil");
        names.add("Sai");
        names.add("Vinil");
        names.add("Ranjith");
        names.add("Vishwas123");
        names.add("Uday");

        // Printing all the names in same order they have appeared using Iterator
        Iterator<String> listiter=names.listIterator();
        System.out.println("List elements in given order are :");
        while(listiter.hasNext()){
            System.out.println(listiter.next());
        }

        System.out.println(" **************** ");


        // Searching an element from the list and it will return index

        System.out.println("Searching for an Item ");
        int searchitem1=Collections.binarySearch(names,"Sai");
        System.out.println(" Search Item 1 :"+searchitem1);
        Object searchitem2=Collections.binarySearch(names,"Nani");
        System.out.println("Searchitem2 : "+searchitem2);
        int searchitem3=Collections.binarySearch(names,"Vishwas123");
        System.out.println("Search Item3 is : "+searchitem3);


        System.out.println(" **************** ");
        // Sorting the names
        Collections.sort(names);
        Iterator<String> sortIter= names.listIterator();
        System.out.println("Names in sorted order is :");
        while (sortIter.hasNext()){
            System.out.println(sortIter.next());
        }
        System.out.println(" **************** ");


        // Printing all the names in reverse order
        Collections.reverse(names);
        Iterator<String> reverse=names.listIterator();
        System.out.println("Names in reverse order is : ");
        while(reverse.hasNext()){
            System.out.println(reverse.next());
        }

        // Copying one List Elements to another List
        System.out.println(" **************** ");
        List<Object> copyobj=new ArrayList<>(names);
        Iterator<Object> ob= copyobj.listIterator();
        System.out.println("Copying one List Elements to another List : ");
        while (ob.hasNext()){
            System.out.println(ob.next());
        }



        System.out.println(" **************** ");


        // Searching an element from the list and it will return index

        System.out.println("Searching for an Item ");
        int searchitem11=Collections.binarySearch(names,"Sai");
        System.out.println(" Search Item 11 :"+searchitem11);
        int searchitem22=Collections.binarySearch(names,"Uday");
        System.out.println("Searchitem 22 : "+searchitem22);
        int searchitem33=Collections.binarySearch(names,"Ranjith");
        System.out.println("Search Item 33 is : "+searchitem33);




    }
}