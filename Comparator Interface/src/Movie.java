import java.util.Comparator;

public class Movie implements Comparator<Movie> {
    private String Name;
    private double rating ;
    private int Year;

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.Year-o2.Year;
    }

    public Movie(String Name, double rating, int Year){
        this.Name=Name;
        this.rating=rating;
        this.Year=Year;
    }

    public String getName(){
        return Name;
    }
    public double getrating(){
        return rating;
    }

    public int getYear(){
        return Year;
    }


}
