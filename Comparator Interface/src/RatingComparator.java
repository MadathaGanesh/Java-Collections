import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1,Movie m2){
        if(m1.getrating()<m2.getrating()){
            return -1;
        }else if(m1.getrating()>m2.getrating()){
            return 1;
        }else{
            return 0;
        }
    }
}
