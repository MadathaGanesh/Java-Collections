import java.util.Map;

public class HashMap {

    // HashMap() : Displays the data Randomly , It does not show the data in the same order in which it is taken as input ......
    // But in LinkedHashMap() : It displays the data in the same order in which it is taken as input

    // It stores data in the form of  { key : value } pair
    // It has 3 general purpose Map Implementations
    //HashMap , TreeMap , LinkedHashMap
    public static void main(String[] args) {
        Map<Integer, String> mapobj = new java.util.HashMap<>();
        mapobj.put(1, "Ganesh");
        mapobj.put(2, "Nani");
        mapobj.put(3, "Sai");
        mapobj.put(4, "Vinil");
        mapobj.put(15, "Ravi");
        mapobj.put(8, "Vishwas");
        mapobj.put(5, "Ranjith");
        mapobj.put(6, "Akhil");

        // Iterating over Map
        System.out.println(" Accessing both keys and Values ........... ");
        for (Map.Entry<Integer, String> i : mapobj.entrySet()) {
            System.out.println(i.getKey() + " - " + i.getValue());
        }

        System.out.println("\n replace() method : ");
        mapobj.replace(4,"Shiva");

        System.out.println("\n Accessing Keys and Values in another method ............");
        for (Integer obj : mapobj.keySet()) {
            System.out.println(obj + " - " + mapobj.get(obj));
        }

        System.out.println(" \n ContainsKey() method ......");
        if (mapobj.containsKey(2)) {
            System.out.println(" key 2 is there in  Map");
        } else {
            System.out.println(" key 2 is there in  Map");
        }


        System.out.println("\n ContainsValue() method ......");
        if (mapobj.containsValue("Vinil")) System.out.println("Vinil is therein Map");
        else System.out.println("Vinil is not there in Map");

        System.out.println(" \n isempty() Method .......");
        if (mapobj.isEmpty()) System.out.println("Map is empty");
        else System.out.println("Map is not empty");

        System.out.println(" \n Size method()  : " + mapobj.size());

        System.out.println("\n hashcode()  method : " + mapobj.hashCode());

        System.out.println("\n remove() method ............");
        mapobj.remove(5);
        System.out.println("After removing Key 5 the remaining elements in Map are :");
        for (Map.Entry<Integer, String> rem : mapobj.entrySet()) {
            System.out.println(rem.getKey() + " -  " + rem.getValue());
        }

        System.out.println("\n keyset() method ....... " + mapobj.keySet());
        System.out.println(" \n All values are : " + mapobj.values());

        //System.out.println(" clear() method() :");
        //mapobj.clear();

       // System.out.println("After using clear() method : " + mapobj.size());

    }




}
