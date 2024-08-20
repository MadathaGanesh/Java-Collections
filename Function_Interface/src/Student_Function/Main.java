package Student_Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
    Student[] obj={                                      // Creating Multiple values with same references or same object name ...
            new Student("Ganesh",89),
            new Student("Pranay",92),
            new Student("Ranjith",37),
            new Student("Vinil",67),
            new Student("Uday",56),
            new Student("Akhil",76)

    };


    Function<Student,String > funobj= s->{
          int marks=s.marks;
          String grade=" ";

          if (marks>90)
              grade="A";
          else if (marks>=80)
              grade="B";
          else if(marks>=70)
              grade="C";
          else if(marks>=60)
              grade="D";
          else
              grade="F";
          return grade;
        };


        for (Student s1:obj) {
            System.out.println("Name is : "+s1.Name);
            System.out.println("Marks is : "+ s1.marks);
            System.out.println("Grade is : "+funobj.apply(s1));
            System.out.println();
        }

    }
}
