package SingleParameterLambda;

public class Main implements InterfaceName {
    public static void main(String[] args) {
       InterfaceName object= (name)->{
            System.out.println("Name is : "+name);
        };
        object.singleparameter("Ganesh Madatha");
    }

    @Override
    public void singleparameter(String name) {
    }

}
