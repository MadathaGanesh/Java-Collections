public class Student {
    String Name;
    String rollno;

    public Student(String Name,String rollno){
        this.Name=Name;
        this.rollno=rollno;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}
