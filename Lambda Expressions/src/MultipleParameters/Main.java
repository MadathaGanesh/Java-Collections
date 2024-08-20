package MultipleParameters;

import java.util.Scanner;

public class Main implements InterfaceName{
    public static void main(String[] args) {

        InterfaceName obj=(name,age,address)->{
            System.out.println("Name is : "+name + " Age is : "+age + " Address is : "+ address);
        };
        obj.Details("Ganesh",20,"Warangal");

    }
    @Override
    public void Details(String name, int age, String address) {

    }
}
