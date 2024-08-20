package NormalWithoutLambda;

public class NormalWithoutLambda implements Addition{
    public static void main(String[] args) {
        NormalWithoutLambda obj=new NormalWithoutLambda();   // Creating an object with new keyword
        obj.addition();


    }
    public void addition(){
        int num1=10;
        int num2=20;
        System.out.println("Adiition of two numbers is :"+ (num1+num2));
    }

}
