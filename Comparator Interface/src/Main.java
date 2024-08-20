import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // This interface helps the programmer to compare the objects on more than one basis . i.e; Name ,age, phonenumber ,rating etc
    // It has compare(object1 , object2 ) methods and equals(object element) method for comparing the objects .
    public static void main(String[] args) {
        ArrayList<Movie> arrlist=new ArrayList<>();
        arrlist.add(new Movie("Leo",8.8,2023));
        arrlist.add(new Movie("Liger",4.0,2019));
        arrlist.add(new Movie("BusinessMan",8.7,2012));
        arrlist.add(new Movie("Vikram",9.4,2022));
        arrlist.add(new Movie("Dookudu",9.1,2014));


        System.out.println("Before Sorting .......  ");
        for (Movie befsort:arrlist){
            System.out.println(befsort.getName() + " " + befsort.getYear() + " " + befsort.getrating());
        }

        System.out.println("\n Sorting based on Rating ...........");
        RatingComparator ratingobj=new RatingComparator();
        Collections.sort(arrlist,ratingobj);
        for (Movie movie:arrlist){
            System.out.println(movie.getrating() + " " + movie.getName() + " " +movie.getYear());
        }

        System.out.println("\n Sorting Based on Name ............");
        NameComparator nameobj=new NameComparator();
        Collections.sort(arrlist,nameobj);
        for(Movie movie: arrlist){
            System.out.println(movie.getName() + " "+movie.getrating()+ " " + movie.getYear());
        }

        System.out.println("\n Sorting Based on Year ................");
        YearComparator yearobj=new YearComparator();
        Collections.sort(arrlist,yearobj);
        for (Movie movie:arrlist){
            System.out.println(movie.getYear() + " " + movie.getName() + " " + movie.getrating());
        }
    }
}