public class Main {
    public static void main(String[] args) {
        Student obj=new Student("Ganesh","608");
        Student obj1=new Student("Ranjith","670");
        Student obj2=new Student("Uday","603");
        Student obj4=obj2;


        System.out.println("Obj is :"+obj.getName());
        System.out.println("Obj1 is :"+obj1.getName());
        System.out.println("Obj2 is :"+obj2.getName());
        System.out.println("Obj4 is :"+obj4.getName());
        if(obj2.equals(obj4)) System.out.println("obj2 and obj4 are equal");
        else System.out.println("Obj2 and obj4 are not equal ");


        if(obj.equals(obj4)) System.out.println("obj and obj4 are equal");
        else System.out.println("Obj and obj4 are not equal ");


        System.out.println(" hashcode() method .................");
        System.out.println(" obj hashcode is : "+obj.hashCode());
        System.out.println(" obj1 hashcode is : "+obj1.hashCode());
        System.out.println(" obj2 hashcode is : "+obj2.hashCode());
        System.out.println(" obj4 hashcode is : "+obj4.hashCode());

        if (obj2.hashCode()==obj4.hashCode()) System.out.println("obj2 and obj4 has same hashcode");
        else System.out.println("obj2 and obj4 has different hashcode");

        if (obj.hashCode()==obj4.hashCode()) System.out.println("obj and obj4 has same hashcode");
        else System.out.println("obj and obj4 has different hashcode");



    }
}