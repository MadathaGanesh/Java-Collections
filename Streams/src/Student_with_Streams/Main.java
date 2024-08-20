package Student_with_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class student {
    String Name;
    int marks;
    double percentage;
    public student(String Name,int marks,double percentage){
        this.Name=Name;
        this.marks=marks;
        this.percentage=percentage;

    }
}

public class Main {
    public static void main(String[] args) {
        List<student> arrobj=new ArrayList<student>();
        arrobj.add(new student("Ganesh",83,86.70));
        arrobj.add(new student("Nani",93,96.70));
        arrobj.add(new student("Bakki",55,47.5));
        arrobj.add(new student("Captain",63,56.70));
        arrobj.add(new student("America",33,46.70));



        List<Double> streamobj=arrobj.stream()
                .filter(p->p.percentage>50)
                .map(p->p.percentage)
                .collect(Collectors.toList());
        System.out.println("Percentages which are greater than  50% are : "+streamobj);
    }
}
